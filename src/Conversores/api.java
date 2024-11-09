package Conversores;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class api {
    private String base = "";
    private String destino = "";
    private double cantidad;
    String conversionResult;

    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();  // Use IDENTITY to avoid changing field names
    HttpClient client = HttpClient.newHttpClient();

    public void sendRequest() {
        String url = "https://v6.exchangerate-api.com/v6/5b0364bee6e2061a1c765ca7/pair/" + base + "/" + destino + "/" + cantidad;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            conversionDeMoneda conversion = gson.fromJson(json, conversionDeMoneda.class);


            if (conversion != null) {
                conversionResult = String.valueOf(conversion.conversion_result());
                System.out.println("***************************************************************************************");
                System.out.println("Resultado de la conversión: " + conversionResult);
                System.out.println("Moneda base: " + conversion.base_code());
                System.out.println("Moneda destino: " + conversion.target_code());
                System.out.println("***************************************************************************************");
            } else {
                System.out.println("La conversión es nula.");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

}
