package j3;

import android.text.TextPaint;
import b3.p;
import b3.s;
import java.util.ArrayList;
import y1.k0;
import y1.m;
import y1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f6950a = new l(false);

    public static final void a(p pVar, o oVar, m mVar, float f10, k0 k0Var, m3.l lVar, a2.h hVar) {
        ArrayList arrayList = pVar.f1421h;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            s sVar = (s) arrayList.get(i7);
            sVar.f1441a.g(oVar, mVar, f10, k0Var, lVar, hVar);
            oVar.n(0.0f, sVar.f1441a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * 255));
    }
}
