package com.tencent.bugly.proguard;

import android.util.Pair;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ad {
    private static Pair<Integer, String> a(String str, String str2, Map<String, String> map) {
        InputStream inputStream;
        DataOutputStream dataOutputStream;
        String string;
        HttpURLConnection httpURLConnection = null;
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                a(httpURLConnection2, map);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                httpURLConnection2.connect();
                byte[] bytes = str2.getBytes("UTF-8");
                dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                try {
                    dataOutputStream.write(bytes);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    responseCode = httpURLConnection2.getResponseCode();
                    InputStream errorStream = responseCode >= 400 ? httpURLConnection2.getErrorStream() : httpURLConnection2.getInputStream();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                            sb2.append("\r\n");
                        }
                        bufferedReader.close();
                        string = sb2.toString();
                        a((Closeable) null);
                        a(errorStream);
                        httpURLConnection2.disconnect();
                    } catch (Throwable th) {
                        httpURLConnection = httpURLConnection2;
                        inputStream = errorStream;
                        th = th;
                        dataOutputStream = null;
                        try {
                            al.b(th);
                            String message = th.getMessage();
                            a(dataOutputStream);
                            a(inputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            string = message;
                        } catch (Throwable th2) {
                            a(dataOutputStream);
                            a(inputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = httpURLConnection2;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream = null;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            dataOutputStream = null;
        }
        return new Pair<>(Integer.valueOf(responseCode), string);
    }

    public static Pair<Integer, String> a(List<String> list) {
        try {
            HashMap map = new HashMap();
            map.put("Atta-Type", "batch-report");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attaid", "0d000062340").put("token", "2273782735").put("type", "batch").put("version", "v1.0.0");
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("datas", jSONArray);
            return a("https://h.trace.qq.com/kv", jSONObject.toString(), map);
        } catch (Throwable th) {
            al.b(th);
            return new Pair<>(-1, th.getMessage());
        }
    }

    private static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e7) {
            al.b(e7);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (httpURLConnection == null || map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }
}
