package com.tencent.bugly.crashreport;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements CrashReport.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f2950a;

    public a(WebView webView) {
        this.f2950a = webView;
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.a
    public final String a() {
        return this.f2950a.getUrl();
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.a
    public final void a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
        this.f2950a.addJavascriptInterface(h5JavaScriptInterface, str);
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.a
    public final void a(String str) {
        this.f2950a.loadUrl(str);
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.a
    public final void b() {
        WebSettings settings = this.f2950a.getSettings();
        if (settings.getJavaScriptEnabled()) {
            return;
        }
        settings.setJavaScriptEnabled(true);
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.a
    public final CharSequence c() {
        return this.f2950a.getContentDescription();
    }
}
