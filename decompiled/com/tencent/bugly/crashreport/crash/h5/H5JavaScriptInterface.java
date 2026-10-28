package com.tencent.bugly.crashreport.crash.h5;

import android.webkit.JavascriptInterface;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.bb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class H5JavaScriptInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashSet<Integer> f3029a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3030b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f3031c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f3032d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f3033e = null;

    private H5JavaScriptInterface() {
    }

    private static bb a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                bb bbVar = new bb();
                String string2 = jSONObject.getString("projectRoot");
                bbVar.f3260a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                bbVar.f3261b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                bbVar.f3262c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                bbVar.f3263d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString("language");
                bbVar.f3264e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString("name");
                bbVar.f3265f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int iIndexOf = string.indexOf("\n");
                if (iIndexOf < 0) {
                    al.d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                bbVar.f3267h = string.substring(iIndexOf + 1);
                String strSubstring = string.substring(0, iIndexOf);
                bbVar.f3266g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    bbVar.f3266g = bbVar.f3266g.substring(iIndexOf2 + 1);
                }
                bbVar.f3268i = jSONObject.getString("file");
                if (bbVar.f3265f == null) {
                    return null;
                }
                long j5 = jSONObject.getLong("lineNumber");
                bbVar.f3269j = j5;
                if (j5 < 0) {
                    return null;
                }
                long j10 = jSONObject.getLong("columnNumber");
                bbVar.k = j10;
                if (j10 < 0) {
                    return null;
                }
                al.a("H5 crash information is following: ", new Object[0]);
                al.a("[projectRoot]: " + bbVar.f3260a, new Object[0]);
                al.a("[context]: " + bbVar.f3261b, new Object[0]);
                al.a("[url]: " + bbVar.f3262c, new Object[0]);
                al.a("[userAgent]: " + bbVar.f3263d, new Object[0]);
                al.a("[language]: " + bbVar.f3264e, new Object[0]);
                al.a("[name]: " + bbVar.f3265f, new Object[0]);
                al.a("[message]: " + bbVar.f3266g, new Object[0]);
                al.a("[stacktrace]: \n" + bbVar.f3267h, new Object[0]);
                al.a("[file]: " + bbVar.f3268i, new Object[0]);
                al.a("[lineNumber]: " + bbVar.f3269j, new Object[0]);
                al.a("[columnNumber]: " + bbVar.k, new Object[0]);
                return bbVar;
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.a aVar) {
        String string = null;
        if (aVar == null || f3029a.contains(Integer.valueOf(aVar.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f3029a.add(Integer.valueOf(aVar.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f3031c = threadCurrentThread;
        if (threadCurrentThread != null) {
            StringBuilder sb2 = new StringBuilder("\n");
            for (int i7 = 2; i7 < threadCurrentThread.getStackTrace().length; i7++) {
                StackTraceElement stackTraceElement = threadCurrentThread.getStackTrace()[i7];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append("\n");
                }
            }
            string = sb2.toString();
        }
        h5JavaScriptInterface.f3032d = string;
        HashMap map = new HashMap();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) aVar.c());
        map.put("[WebView] ContentDescription", sb3.toString());
        h5JavaScriptInterface.f3033e = map;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        al.d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            al.d("Payload from JS is null.", new Object[0]);
            return;
        }
        String strC = ap.c(str.getBytes());
        String str2 = this.f3030b;
        if (str2 != null && str2.equals(strC)) {
            al.d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f3030b = strC;
        al.d("Handling JS exception ...", new Object[0]);
        bb bbVarA = a(str);
        if (bbVarA == null) {
            al.d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = bbVarA.f3260a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = bbVarA.f3261b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = bbVarA.f3262c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = bbVarA.f3263d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = bbVarA.f3268i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j5 = bbVarA.f3269j;
        if (j5 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j5));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f3033e);
        linkedHashMap.put("Java Stack", this.f3032d);
        InnerApi.postH5CrashAsync(this.f3031c, bbVarA.f3265f, bbVarA.f3266g, bbVarA.f3267h, linkedHashMap);
    }
}
