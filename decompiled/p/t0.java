package p;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9924d;

    public /* synthetic */ t0(int i7, int i10, Object obj, Object obj2) {
        this.f9921a = i10;
        this.f9923c = obj;
        this.f9924d = obj2;
        this.f9922b = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9921a) {
            case 0:
                ((TextView) this.f9923c).setTypeface((Typeface) this.f9924d, this.f9922b);
                break;
            default:
                String[] strArr = (String[]) this.f9923c;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) this.f9924d;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = packageManager.checkPermission(strArr[i7], packageName);
                }
                ((u3.b) activity).onRequestPermissionsResult(this.f9922b, strArr, iArr);
                break;
        }
    }
}
