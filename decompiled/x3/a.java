package x3;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14561a = new ThreadLocal();

    public static int a(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double dPow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double dPow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double dPow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : 12.92d * d15;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i7, int i10) {
        int iAlpha = Color.alpha(i10);
        int iAlpha2 = Color.alpha(i7);
        int i11 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i11, c(Color.red(i7), iAlpha2, Color.red(i10), iAlpha, i11), c(Color.green(i7), iAlpha2, Color.green(i10), iAlpha, i11), c(Color.blue(i7), iAlpha2, Color.blue(i10), iAlpha, i11));
    }

    public static int c(int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i7 * 255) * i10)) / (i13 * 255);
    }
}
