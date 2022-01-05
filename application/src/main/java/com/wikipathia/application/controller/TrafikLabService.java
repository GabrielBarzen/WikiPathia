package com.wikipathia.application.controller;

import com.google.gson.*;
import com.wikipathia.application.model.trafiklab.Route;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.BufferedReader;
import java.io.FileReader;

public class TrafikLabService {

    private final WebClient client;
    private final String apiKey;

    public TrafikLabService(WebClient.Builder webClientBuilder) {

        apiKey = readKey();
        if (apiKey != null) this.client = webClientBuilder.baseUrl("https://api.resrobot.se/v2/").build();
        else client = null;

    }

    private String readKey() {
        String key = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("keys/key.dat"))){
            key = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }

    public Route getRouteFromID(int stopIdOrigin, int stopIdDestination) {
        Route routes;


        //String routeJSON = this.client.get().uri("/trip?format=json&originId={stopIdOrigin}&destId={stopIdDestination}&numF=1&numB=0&key={apiKey}", stopIdOrigin, stopIdDestination, apiKey)
        //        .retrieve().bodyToMono(String.class).block();

       String tripJson = """
               {
                 "Trip" : [ {
                   "ServiceDays" : [ {
                     "planningPeriodBegin" : "2021-12-30",
                     "planningPeriodEnd" : "2022-06-11",
                     "sDaysR" : "not every day",
                     "sDaysI" : "3. Jan until 21. Apr 2022 Mo - Th; not 5., 6. Jan, 14., 18. Apr",
                     "sDaysB" : "0C1E3C78F1E3C78F1E3C78F1E38380000000000000"
                   } ],
                   "LegList" : {
                     "Leg" : [ {
                       "Origin" : {
                         "name" : "Ekeby (Flen kn)",
                         "type" : "ST",
                         "id" : "740039295",
                         "extId" : "740039295",
                         "lon" : 16.650575,
                         "lat" : 59.178479,
                         "routeIdx" : 53,
                         "time" : "20:06:00",
                         "date" : "2022-01-03"
                       },
                       "Destination" : {
                         "name" : "Eskilstuna Centralstation",
                         "type" : "ST",
                         "id" : "740000170",
                         "extId" : "740000170",
                         "lon" : 16.505193,
                         "lat" : 59.369482,
                         "routeIdx" : 80,
                         "time" : "20:41:00",
                         "date" : "2022-01-03"
                       },
                       "Product" : {
                         "name" : "L?nstrafik - Buss 701",
                         "num" : "701",
                         "catCode" : "7",
                         "catOutS" : "BLT",
                         "catOutL" : "L?nstrafik - Buss",
                         "operatorCode" : "252",
                         "operator" : "S?rmlandstrafiken",
                         "operatorUrl" : "http://www.sormlandstrafiken.se/"
                       },
                       "Stops" : {
                         "Stop" : [ {
                           "name" : "Ekeby (Flen kn)",
                           "id" : "740039295",
                           "extId" : "740039295",
                           "routeIdx" : 53,
                           "lon" : 16.650575,
                           "lat" : 59.178479,
                           "depTime" : "20:06:00",
                           "depDate" : "2022-01-03"
                         }, {
                           "name" : "Gropetorp (Flen kn)",
                           "id" : "740039296",
                           "extId" : "740039296",
                           "routeIdx" : 54,
                           "lon" : 16.643474,
                           "lat" : 59.18283,
                           "depTime" : "20:07:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:07:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "B?ck?sen (Flen kn)",
                           "id" : "740021541",
                           "extId" : "740021541",
                           "routeIdx" : 55,
                           "lon" : 16.628462,
                           "lat" : 59.190048,
                           "depTime" : "20:09:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:09:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Mortorps krog (Eskilstuna kn)",
                           "id" : "740039298",
                           "extId" : "740039298",
                           "routeIdx" : 56,
                           "lon" : 16.612191,
                           "lat" : 59.208035,
                           "depTime" : "20:11:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:11:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Br?nnk?rr (Eskilstuna kn)",
                           "id" : "740037992",
                           "extId" : "740037992",
                           "routeIdx" : 57,
                           "lon" : 16.616003,
                           "lat" : 59.219712,
                           "depTime" : "20:11:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:11:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Slytan (Eskilstuna kn)",
                           "id" : "740037990",
                           "extId" : "740037990",
                           "routeIdx" : 58,
                           "lon" : 16.601845,
                           "lat" : 59.242347,
                           "depTime" : "20:13:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:13:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Hamra g?rd (Eskilstuna kn)",
                           "id" : "740037989",
                           "extId" : "740037989",
                           "routeIdx" : 59,
                           "lon" : 16.590087,
                           "lat" : 59.254537,
                           "depTime" : "20:14:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:14:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "?rla kyrka (Eskilstuna kn)",
                           "id" : "740020378",
                           "extId" : "740020378",
                           "routeIdx" : 60,
                           "lon" : 16.586734,
                           "lat" : 59.258429,
                           "depTime" : "20:15:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:15:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Sp?nga (Eskilstuna kn)",
                           "id" : "740037988",
                           "extId" : "740037988",
                           "routeIdx" : 61,
                           "lon" : 16.5753,
                           "lat" : 59.265827,
                           "depTime" : "20:15:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:15:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Svelunda (Eskilstuna kn)",
                           "id" : "740037987",
                           "extId" : "740037987",
                           "routeIdx" : 62,
                           "lon" : 16.565169,
                           "lat" : 59.274106,
                           "depTime" : "20:16:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:16:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "K?lbro (Eskilstuna kn)",
                           "id" : "740020886",
                           "extId" : "740020886",
                           "routeIdx" : 63,
                           "lon" : 16.543927,
                           "lat" : 59.286727,
                           "depTime" : "20:17:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:17:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "H?llstav?gen (Eskilstuna kn)",
                           "id" : "740037985",
                           "extId" : "740037985",
                           "routeIdx" : 64,
                           "lon" : 16.540152,
                           "lat" : 59.291419,
                           "depTime" : "20:18:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:18:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "?rsta (Eskilstuna kn)",
                           "id" : "740021444",
                           "extId" : "740021444",
                           "routeIdx" : 65,
                           "lon" : 16.540853,
                           "lat" : 59.294736,
                           "depTime" : "20:19:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:19:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Annedal (Eskilstuna kn)",
                           "id" : "740037984",
                           "extId" : "740037984",
                           "routeIdx" : 66,
                           "lon" : 16.538255,
                           "lat" : 59.299923,
                           "depTime" : "20:20:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:20:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Haga (Stenkvista) (Eskilstuna kn)",
                           "id" : "740037983",
                           "extId" : "740037983",
                           "routeIdx" : 67,
                           "lon" : 16.535693,
                           "lat" : 59.303204,
                           "depTime" : "20:20:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:20:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Kolunda s?dra (Eskilstuna kn)",
                           "id" : "740037982",
                           "extId" : "740037982",
                           "routeIdx" : 68,
                           "lon" : 16.532439,
                           "lat" : 59.307573,
                           "depTime" : "20:20:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:20:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Kolunda norra (Eskilstuna kn)",
                           "id" : "740037981",
                           "extId" : "740037981",
                           "routeIdx" : 69,
                           "lon" : 16.532709,
                           "lat" : 59.311232,
                           "depTime" : "20:21:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:21:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Stenkvista kyrka (Eskilstuna kn)",
                           "id" : "740020885",
                           "extId" : "740020885",
                           "routeIdx" : 70,
                           "lon" : 16.532556,
                           "lat" : 59.315501,
                           "depTime" : "20:21:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:21:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Anderslundav?gen (Eskilstuna kn)",
                           "id" : "740024341",
                           "extId" : "740024341",
                           "routeIdx" : 71,
                           "lon" : 16.529652,
                           "lat" : 59.328446,
                           "depTime" : "20:23:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:23:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Ravi (Eskilstuna kn)",
                           "id" : "740037941",
                           "extId" : "740037941",
                           "routeIdx" : 72,
                           "lon" : 16.529032,
                           "lat" : 59.33321,
                           "depTime" : "20:24:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:24:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Borefors (Eskilstuna kn)",
                           "id" : "740037939",
                           "extId" : "740037939",
                           "routeIdx" : 73,
                           "lon" : 16.528655,
                           "lat" : 59.340285,
                           "depTime" : "20:25:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:25:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Lilla Nyby (Eskilstuna kn)",
                           "id" : "740037938",
                           "extId" : "740037938",
                           "routeIdx" : 74,
                           "lon" : 16.531846,
                           "lat" : 59.344725,
                           "depTime" : "20:25:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "20:25:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Tunafors (Eskilstuna kn)",
                           "id" : "740021440",
                           "extId" : "740021440",
                           "routeIdx" : 75,
                           "lon" : 16.530875,
                           "lat" : 59.358937,
                           "arrTime" : "20:27:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Eskilstuna M?larsjukhus/Sveav",
                           "id" : "740021385",
                           "extId" : "740021385",
                           "routeIdx" : 76,
                           "lon" : 16.531297,
                           "lat" : 59.361958,
                           "arrTime" : "20:28:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Eskilstuna Sveaplan",
                           "id" : "740022057",
                           "extId" : "740022057",
                           "routeIdx" : 77,
                           "lon" : 16.52416,
                           "lat" : 59.367252,
                           "arrTime" : "20:30:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Eskilstuna R?dhustorget",
                           "id" : "740022056",
                           "extId" : "740022056",
                           "routeIdx" : 78,
                           "lon" : 16.520061,
                           "lat" : 59.368556,
                           "arrTime" : "20:31:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Eskilstuna Fristadstorget",
                           "id" : "740020297",
                           "extId" : "740020297",
                           "routeIdx" : 79,
                           "lon" : 16.515494,
                           "lat" : 59.369949,
                           "arrTime" : "20:33:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Eskilstuna Centralstation",
                           "id" : "740000170",
                           "extId" : "740000170",
                           "routeIdx" : 80,
                           "lon" : 16.505193,
                           "lat" : 59.369482,
                           "arrTime" : "20:41:00",
                           "arrDate" : "2022-01-03"
                         } ]
                       },
                       "idx" : "0",
                       "name" : "L?nstrafik - Buss 701",
                       "transportNumber" : "701",
                       "transportCategory" : "BLT",
                       "type" : "JNY",
                       "reachable" : true,
                       "direction" : "Eskilstuna Centralstation"
                     }, {
                       "Origin" : {
                         "name" : "Eskilstuna Centralstation",
                         "type" : "ST",
                         "id" : "740000170",
                         "extId" : "740000170",
                         "lon" : 16.505193,
                         "lat" : 59.369482,
                         "routeIdx" : 5,
                         "time" : "21:52:00",
                         "date" : "2022-01-03"
                       },
                       "Destination" : {
                         "name" : "V?ster?s Centralstation",
                         "type" : "ST",
                         "id" : "740000099",
                         "extId" : "740000099",
                         "lon" : 16.551712,
                         "lat" : 59.607705,
                         "routeIdx" : 8,
                         "time" : "22:26:00",
                         "date" : "2022-01-03"
                       },
                       "Notes" : {
                         "Note" : [ {
                           "value" : "Endast 2 klass",
                           "key" : "AA",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 8
                         }, {
                           "value" : "Ej reservering",
                           "key" : "AE",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 8
                         }, {
                           "value" : "Rullstolslyft",
                           "key" : "AN",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 8
                         }, {
                           "value" : "WiFi",
                           "key" : "AW",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 8
                         }, {
                           "value" : "Eluttag vid sittplats",
                           "key" : "EL",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 8
                         }, {
                           "value" : "Cyklar till?tna",
                           "key" : "FB",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 8
                         }, {
                           "value" : "Movingo g?ller",
                           "key" : "KM",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 8
                         } ]
                       },
                       "Product" : {
                         "name" : "Regional T?g 2168",
                         "num" : "2168",
                         "catCode" : "2",
                         "catOutS" : "JRE",
                         "catOutL" : "Regional T?g",
                         "operatorCode" : "313",
                         "operator" : "M?lart?g",
                         "operatorUrl" : "https://malartag.se"
                       },
                       "Stops" : {
                         "Stop" : [ {
                           "name" : "Eskilstuna Centralstation",
                           "id" : "740000170",
                           "extId" : "740000170",
                           "routeIdx" : 5,
                           "lon" : 16.505193,
                           "lat" : 59.369482,
                           "depTime" : "21:52:00",
                           "depDate" : "2022-01-03"
                         }, {
                           "name" : "Kvicksund station (V?ster?s kn)",
                           "id" : "740000677",
                           "extId" : "740000677",
                           "routeIdx" : 6,
                           "lon" : 16.320491,
                           "lat" : 59.450879,
                           "depTime" : "22:03:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "22:03:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "Kolb?ck station (Hallstahammar kn)",
                           "id" : "740000321",
                           "extId" : "740000321",
                           "routeIdx" : 7,
                           "lon" : 16.232478,
                           "lat" : 59.563837,
                           "depTime" : "22:15:00",
                           "depDate" : "2022-01-03",
                           "arrTime" : "22:15:00",
                           "arrDate" : "2022-01-03"
                         }, {
                           "name" : "V?ster?s Centralstation",
                           "id" : "740000099",
                           "extId" : "740000099",
                           "routeIdx" : 8,
                           "lon" : 16.551712,
                           "lat" : 59.607705,
                           "arrTime" : "22:26:00",
                           "arrDate" : "2022-01-03"
                         } ]
                       },
                       "idx" : "1",
                       "name" : "Regional T?g 2168",
                       "transportNumber" : "2168",
                       "transportCategory" : "JRE",
                       "type" : "JNY",
                       "reachable" : true,
                       "direction" : "V?ster?s Centralstation"
                     }, {
                       "Origin" : {
                         "name" : "V?ster?s Centralstation",
                         "type" : "ST",
                         "id" : "740000099",
                         "extId" : "740000099",
                         "lon" : 16.551712,
                         "lat" : 59.607705,
                         "routeIdx" : 5,
                         "time" : "22:53:00",
                         "date" : "2022-01-03"
                       },
                       "Destination" : {
                         "name" : "?nge station",
                         "type" : "ST",
                         "id" : "740000105",
                         "extId" : "740000105",
                         "lon" : 15.658427,
                         "lat" : 62.523266,
                         "routeIdx" : 7,
                         "time" : "05:14:00",
                         "date" : "2022-01-04"
                       },
                       "Notes" : {
                         "Note" : [ {
                           "value" : "Bistrovagn",
                           "key" : "AD",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 7
                         }, {
                           "value" : "Obligatorisk platsbokning",
                           "key" : "AF",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 7
                         }, {
                           "value" : "WiFi",
                           "key" : "AW",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 7
                         }, {
                           "value" : "Sov- och liggvagn",
                           "key" : "SL",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 7
                         }, {
                           "value" : "no A/C",
                           "key" : "SY",
                           "type" : "A",
                           "priority" : 100,
                           "routeIdxFrom" : 5,
                           "routeIdxTo" : 7
                         } ]
                       },
                       "Product" : {
                         "name" : "Natt?g 74",
                         "num" : "74",
                         "catCode" : "2",
                         "catOutS" : "JNT",
                         "catOutL" : "Natt?g",
                         "operatorCode" : "74",
                         "operator" : "SJ",
                         "operatorUrl" : "http://www.sj.se"
                       },
                       "Stops" : {
                         "Stop" : [ {
                           "name" : "V?ster?s Centralstation",
                           "id" : "740000099",
                           "extId" : "740000099",
                           "routeIdx" : 5,
                           "lon" : 16.551712,
                           "lat" : 59.607705,
                           "depTime" : "22:53:00",
                           "depDate" : "2022-01-03"
                         }, {
                           "name" : "Sundsvall Centralstation",
                           "id" : "740000130",
                           "extId" : "740000130",
                           "routeIdx" : 6,
                           "lon" : 17.315633,
                           "lat" : 62.386873
                         }, {
                           "name" : "?nge station",
                           "id" : "740000105",
                           "extId" : "740000105",
                           "routeIdx" : 7,
                           "lon" : 15.658427,
                           "lat" : 62.523266,
                           "arrTime" : "05:14:00",
                           "arrDate" : "2022-01-04"
                         } ]
                       },
                       "idx" : "2",
                       "name" : "Natt?g 74",
                       "transportNumber" : "74",
                       "transportCategory" : "JNT",
                       "type" : "JNY",
                       "reachable" : true,
                       "direction" : "Duved station (?re kn)"
                     }, {
                       "Origin" : {
                         "name" : "?nge station",
                         "type" : "ST",
                         "id" : "740000105",
                         "extId" : "740000105",
                         "lon" : 15.658427,
                         "lat" : 62.523266,
                         "routeIdx" : 0,
                         "time" : "06:30:00",
                         "date" : "2022-01-04"
                       },
                       "Destination" : {
                         "name" : "Sveg Nilsvallen (H?rjedalen kn)",
                         "type" : "ST",
                         "id" : "740013306",
                         "extId" : "740013306",
                         "lon" : 14.405924,
                         "lat" : 62.038055,
                         "routeIdx" : 27,
                         "time" : "07:56:00",
                         "date" : "2022-01-04"
                       },
                       "Notes" : {
                         "Note" : [ {
                           "value" : "Turen m?ste f?rbest?llas p? telefon 0771-820083 senast klockan 17.00 1 dag f?re resa.",
                           "key" : "Ad",
                           "type" : "A",
                           "priority" : 0,
                           "routeIdxFrom" : 0,
                           "routeIdxTo" : 0
                         } ]
                       },
                       "Product" : {
                         "name" : "L?nstrafik - Taxi 26",
                         "num" : "26",
                         "catCode" : "9",
                         "catOutS" : "TLT",
                         "catOutL" : "L?nstrafik - Taxi",
                         "operatorCode" : "271",
                         "operator" : "L?nstrafiken J?mtland",
                         "operatorUrl" : "http://ltr.se/"
                       },
                       "Stops" : {
                         "Stop" : [ {
                           "name" : "?nge station",
                           "id" : "740000105",
                           "extId" : "740000105",
                           "routeIdx" : 0,
                           "lon" : 15.658427,
                           "lat" : 62.523266,
                           "depTime" : "06:30:00",
                           "depDate" : "2022-01-04"
                         }, {
                           "name" : "?stavall (?nge kn)",
                           "id" : "740015357",
                           "extId" : "740015357",
                           "routeIdx" : 1,
                           "lon" : 15.475739,
                           "lat" : 62.428736,
                           "depTime" : "06:41:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "06:41:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "K?lsillre (?nge kn)",
                           "id" : "740015197",
                           "extId" : "740015197",
                           "routeIdx" : 2,
                           "lon" : 15.210252,
                           "lat" : 62.39766,
                           "depTime" : "06:51:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "06:51:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Torrflon?s (?nge kn)",
                           "id" : "740018287",
                           "extId" : "740018287",
                           "routeIdx" : 3,
                           "lon" : 15.126095,
                           "lat" : 62.325827,
                           "depTime" : "07:01:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:01:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Stens?n (H?rjedalen kn)",
                           "id" : "740018415",
                           "extId" : "740018415",
                           "routeIdx" : 4,
                           "lon" : 15.173791,
                           "lat" : 62.236321,
                           "depTime" : "07:08:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:08:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Minne Norra (H?rjedalen kn)",
                           "id" : "740029401",
                           "extId" : "740029401",
                           "routeIdx" : 5,
                           "lon" : 15.162061,
                           "lat" : 62.211071,
                           "depTime" : "07:10:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:10:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Minne S?dra (H?rjedalen kn)",
                           "id" : "740070628",
                           "extId" : "740070628",
                           "routeIdx" : 6,
                           "lon" : 15.156991,
                           "lat" : 62.207133,
                           "depTime" : "07:11:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:11:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "F?ssj?dal (H?rjedalen kn)",
                           "id" : "740029400",
                           "extId" : "740029400",
                           "routeIdx" : 7,
                           "lon" : 15.161575,
                           "lat" : 62.181676,
                           "depTime" : "07:13:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:13:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Ytterhogdal (H?rjedalen kn)",
                           "id" : "740013308",
                           "extId" : "740013308",
                           "routeIdx" : 8,
                           "lon" : 14.938103,
                           "lat" : 62.174296,
                           "depTime" : "07:30:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:30:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Ytterhogdal ?stansj? (H?rjedalen kn)",
                           "id" : "740017775",
                           "extId" : "740017775",
                           "routeIdx" : 9,
                           "lon" : 14.950904,
                           "lat" : 62.171132,
                           "depTime" : "07:31:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:31:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Gammeltr?det (H?rjedalen kn)",
                           "id" : "740017776",
                           "extId" : "740017776",
                           "routeIdx" : 10,
                           "lon" : 14.950374,
                           "lat" : 62.161199,
                           "depTime" : "07:32:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:32:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Hammarby (H?rjedalen kn)",
                           "id" : "740017777",
                           "extId" : "740017777",
                           "routeIdx" : 11,
                           "lon" : 14.953448,
                           "lat" : 62.156884,
                           "depTime" : "07:32:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:32:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "S?nna norra (H?rjedalen kn)",
                           "id" : "740069790",
                           "extId" : "740069790",
                           "routeIdx" : 12,
                           "lon" : 14.971723,
                           "lat" : 62.127219,
                           "depTime" : "07:35:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:35:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "S?nna S?dra (H?rjedalen kn)",
                           "id" : "740029367",
                           "extId" : "740029367",
                           "routeIdx" : 13,
                           "lon" : 14.970078,
                           "lat" : 62.11823,
                           "depTime" : "07:35:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:35:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Aspan (H?rjedalen kn)",
                           "id" : "740029895",
                           "extId" : "740029895",
                           "routeIdx" : 14,
                           "lon" : 14.938184,
                           "lat" : 62.07101,
                           "depTime" : "07:38:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:38:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Krokstr?mmen (H?rjedalen kn)",
                           "id" : "740029366",
                           "extId" : "740029366",
                           "routeIdx" : 15,
                           "lon" : 14.878244,
                           "lat" : 62.046667,
                           "depTime" : "07:40:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:40:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "M?rosen (H?rjedalen kn)",
                           "id" : "740017778",
                           "extId" : "740017778",
                           "routeIdx" : 16,
                           "lon" : 14.788181,
                           "lat" : 62.046568,
                           "depTime" : "07:43:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:43:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Rismyr (H?rjedalen kn)",
                           "id" : "740029893",
                           "extId" : "740029893",
                           "routeIdx" : 17,
                           "lon" : 14.719342,
                           "lat" : 62.042883,
                           "depTime" : "07:45:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:45:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Rismyr Tr?n (H?rjedalen kn)",
                           "id" : "740017787",
                           "extId" : "740017787",
                           "routeIdx" : 18,
                           "lon" : 14.69037,
                           "lat" : 62.041759,
                           "depTime" : "07:46:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:46:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "?lvros nya kyrka (H?rjedalen kn)",
                           "id" : "740024249",
                           "extId" : "740024249",
                           "routeIdx" : 19,
                           "lon" : 14.660534,
                           "lat" : 62.044662,
                           "depTime" : "07:48:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:48:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "?lvros (H?rjedalen kn)",
                           "id" : "740013574",
                           "extId" : "740013574",
                           "routeIdx" : 20,
                           "lon" : 14.650862,
                           "lat" : 62.047719,
                           "depTime" : "07:50:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:50:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "?lvros S?tervallens vsk E45 (H?rjedalen kn)",
                           "id" : "740017779",
                           "extId" : "740017779",
                           "routeIdx" : 21,
                           "lon" : 14.642565,
                           "lat" : 62.051225,
                           "depTime" : "07:50:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:50:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "?lvros H?rjedalsg?rden (H?rjedalen kn)",
                           "id" : "740017780",
                           "extId" : "740017780",
                           "routeIdx" : 22,
                           "lon" : 14.635922,
                           "lat" : 62.052052,
                           "depTime" : "07:51:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:51:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "L?ngskogen (H?rjedalen kn)",
                           "id" : "740017770",
                           "extId" : "740017770",
                           "routeIdx" : 23,
                           "lon" : 14.535881,
                           "lat" : 62.053957,
                           "depTime" : "07:53:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:53:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Extj?rn (H?rjedalen kn)",
                           "id" : "740017772",
                           "extId" : "740017772",
                           "routeIdx" : 24,
                           "lon" : 14.508383,
                           "lat" : 62.050451,
                           "depTime" : "07:53:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:53:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Solnan (H?rjedalen kn)",
                           "id" : "740029365",
                           "extId" : "740029365",
                           "routeIdx" : 25,
                           "lon" : 14.475042,
                           "lat" : 62.045157,
                           "depTime" : "07:54:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:54:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Sveg H?tj?rnen (H?rjedalen kn)",
                           "id" : "740017781",
                           "extId" : "740017781",
                           "routeIdx" : 26,
                           "lon" : 14.430294,
                           "lat" : 62.03792,
                           "depTime" : "07:55:00",
                           "depDate" : "2022-01-04",
                           "arrTime" : "07:55:00",
                           "arrDate" : "2022-01-04"
                         }, {
                           "name" : "Sveg Nilsvallen (H?rjedalen kn)",
                           "id" : "740013306",
                           "extId" : "740013306",
                           "routeIdx" : 27,
                           "lon" : 14.405924,
                           "lat" : 62.038055,
                           "arrTime" : "07:56:00",
                           "arrDate" : "2022-01-04"
                         } ]
                       },
                       "idx" : "3",
                       "name" : "L?nstrafik - Taxi 26",
                       "transportNumber" : "26",
                       "transportCategory" : "TLT",
                       "type" : "JNY",
                       "reachable" : true,
                       "direction" : "Sveg station (H?rjedalen kn)"
                     }, {
                       "Origin" : {
                         "name" : "Sveg Nilsvallen (H?rjedalen kn)",
                         "type" : "ST",
                         "id" : "740013306",
                         "extId" : "740013306",
                         "lon" : 14.405924,
                         "lat" : 62.038055,
                         "time" : "07:56:00",
                         "date" : "2022-01-04"
                       },
                       "Destination" : {
                         "name" : "Sveg flygplats (H?rjedalen kn)",
                         "type" : "ST",
                         "id" : "740026031",
                         "extId" : "740026031",
                         "lon" : 14.418698,
                         "lat" : 62.046685,
                         "time" : "08:24:00",
                         "date" : "2022-01-04"
                       },
                       "idx" : "4",
                       "name" : "",
                       "type" : "WALK",
                       "duration" : "PT28M",
                       "dist" : 1805
                     } ]
                   },
                   "idx" : 0,
                   "tripId" : "C-0",
                   "ctxRecon" : "T$A=1@O=Ekeby (Flen kn)@L=740039295@a=128@$A=1@O=Eskilstuna Centralstation@L=740000170@a=128@$202201032006$202201032041$BLT  701$$1$?T$A=1@O=Eskilstuna Centralstation@L=740000170@a=128@$A=1@O=V?ster?s Centralstation@L=740000099@a=128@$202201032152$202201032226$JRE 2168$$1$?T$A=1@O=V?ster?s Centralstation@L=740000099@a=128@$A=1@O=?nge station@L=740000105@a=128@$202201032253$202201040514$JNT   74$$1$?T$A=1@O=?nge station@L=740000105@a=128@$A=1@O=Sveg Nilsvallen (H?rjedalen kn)@L=740013306@a=128@$202201040630$202201040756$TLT   26$$1$?G@F$A=1@O=Sveg Nilsvallen (H?rjedalen kn)@L=740013306@a=128@$A=1@O=Sveg flygplats (H?rjedalen kn)@L=740026031@a=128@$202201040756$202201040824$$$1$",
                   "duration" : "PT12H18M"
                 } ],
                 "scrB" : "1|OB|MT?11?9846?9846?10584?10584?0?0?5?9597?1?-2147483598?0?1?2|PDH?68d95d88282023ed4bf842a7f99a7e70|RD?3012022|RT?155708",
                 "scrF" : "1|OF|MT?11?9846?9846?10584?10584?0?0?5?9597?1?-2147483598?0?1?2|PDH?68d95d88282023ed4bf842a7f99a7e70|RD?3012022|RT?155708"
               }""";

       JsonElement fugma = JsonParser.parseString(tripJson);

       Gson gson = new Gson();

       routes = gson.fromJson(fugma, Route.class);


       /*if(tripJson != null) {
           JsonElement jsonElementOrigin = JsonParser.parseString(tripJson);

           JsonElement tripJsonObject = jsonElementOrigin.getAsJsonObject().get("Trip");

           JsonElement legList = tripJsonObject.getAsJsonArray().get(0).getAsJsonObject().get("LegList").getAsJsonObject().get("Leg");

           JsonArray legs = legList.getAsJsonArray();

           System.out.println(legs);

           for (int i = 0; i < legs.size(); i++) {
               JsonElement leg = legs.get(i);
               JsonElement stops = leg.getAsJsonObject().get("Stops");

               if (stops != null) {
                   JsonElement stop = stops.getAsJsonObject().get("Stop");

                   JsonArray stopArray = stop.getAsJsonArray();

                   for (int j = 0; j < stopArray.size(); j++) {
                       JsonElement objäkt = stopArray.get(j);
                       System.out.println();
                       System.out.println(objäkt);
                       System.out.println();

                   }
               } else {
                   JsonElement origin = leg.getAsJsonObject().get("Origin");
                   JsonElement destination = leg.getAsJsonObject().get("Destination");
                   System.out.println();
                   System.out.println(origin);
                   System.out.println();
                   System.out.println();
                   System.out.println(destination);
                   System.out.println();

               }
           }




       } else {

       }*/


       return routes;
    }

    public Route getRouteFromCoordinates(double latOrigin, double lonOrigin, double latDestination, double lonDestination) {
        Route route = new Route();

        String originJSON = this.client.get().uri("/location.nearbystops?format=json&originCoordLat={latOrigin}&originCoordLong={lonOrigin}&key={apiKey}" , latOrigin,lonOrigin,apiKey)
                .retrieve().bodyToMono(String.class).block();

        String destinationJSON = this.client.get().uri("/location.nearbystops?format=json&originCoordLat={latDestination}&originCoordLong={lonDestination}&key={apiKey}" , latDestination,lonDestination,apiKey)
                .retrieve().bodyToMono(String.class).block();
        /*
        if(originJSON != null && destinationJSON != null) {
            JsonElement jsonElementOrigin = JsonParser.parseString(originJSON);
            JsonElement jsonElementDestination = JsonParser.parseString(destinationJSON);

            JsonElement origin = jsonElementOrigin.getAsJsonObject().get("StopLocation");
            JsonElement destination = jsonElementDestination.getAsJsonObject().get("StopLocation");

            JsonElement originArray = origin.getAsJsonArray();
            JsonElement destinationArray = destination.getAsJsonArray();

            Gson gson = new Gson();

            Stop[] originStops = gson.fromJson(originArray, Stop[].class);
            Stop[] destinationStops = gson.fromJson(destinationArray, Stop[].class);

            Stop originStop = originStops[0];
            Stop destinationStop = destinationStops[0];

            int routeorigin = originStop.id;
            int routeDest = destinationStop.id;

            trip = getRouteFromID(routeorigin, routeDest);

        } else {
            trip = null;
        }

        return trip;*/
        return route;
    }
}
