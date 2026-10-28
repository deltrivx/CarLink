package l0;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum z0 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(o0.e.f9255a, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(o0.e.f9256b, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(o0.e.f9257c, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(o0.e.f9258d, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(o0.e.f9259e, Build.VERSION.SDK_INT <= 26 ? com.baidu.carlifevehicle.R.string.autofill : R.string.autofill, 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7964c;

    z0(Object obj, int i7, int i10) {
        this.f7962a = obj;
        this.f7963b = i7;
        this.f7964c = i10;
    }
}
