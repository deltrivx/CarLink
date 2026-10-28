package a8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.FillElement;
import c1.u2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h9.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f76b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f77c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78a;

    public /* synthetic */ b(int i7) {
        this.f78a = i7;
    }

    public b(g0 g0Var) {
        this.f78a = 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intrinsicWidth;
        int intrinsicHeight;
        y1.f fVar;
        switch (this.f78a) {
            case 0:
                l8.j0 j0Var = (l8.j0) obj;
                f1.s sVar = (f1.s) obj2;
                ((Number) obj3).intValue();
                i9.l.e(j0Var, "it");
                u2.b(j0Var.f8196a, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, g5.a.n(32, sVar), 0.0f, 2), 0L, n3.r.K(g5.a.n(16, sVar), 4294967296L), null, 0L, new m3.k(3), 0L, 0, false, 0, 0, null, sVar, 0, 0, 130548);
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj2;
                int iIntValue = ((Number) obj3).intValue();
                i9.l.e((d0.o0) obj, "$this$FilledTonalButton");
                if ((iIntValue & 17) == 16 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    u2.b("默认", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 6, 0, 131070);
                }
                break;
            default:
                l8.j0 j0Var2 = (l8.j0) obj;
                f1.s sVar3 = (f1.s) obj2;
                ((Number) obj3).intValue();
                i9.l.e(j0Var2, "item");
                d0.d dVar = d0.h.f3569d;
                r1.f fVar2 = r1.c.f11104n;
                FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
                d0.s sVarA = d0.q.a(dVar, fVar2, sVar3, 54);
                long j5 = sVar3.T;
                int i7 = (int) (j5 ^ (j5 >>> 32));
                f1.q1 q1VarL = sVar3.l();
                r1.p pVarC = r1.a.c(sVar3, fillElement);
                q2.j.f10719d0.getClass();
                q2.a0 a0Var = q2.i.f10705b;
                sVar3.a0();
                if (sVar3.S) {
                    sVar3.k(a0Var);
                } else {
                    sVar3.k0();
                }
                f1.b.w(sVar3, q2.i.f10708e, sVarA);
                f1.b.w(sVar3, q2.i.f10707d, q1VarL);
                q2.h hVar = q2.i.f10709f;
                if (sVar3.S || !i9.l.a(sVar3.K(), Integer.valueOf(i7))) {
                    ob.a.w(i7, sVar3, i7, hVar);
                }
                f1.b.w(sVar3, q2.i.f10706c, pVarC);
                Drawable drawable = j0Var2.f8199d;
                i9.l.e(drawable, "<this>");
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getBitmap() != null) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        i9.l.d(bitmap, "getBitmap(...)");
                        fVar = new y1.f(bitmap);
                    } else {
                        if (drawable.getIntrinsicWidth() > 0) {
                            intrinsicWidth = drawable.getIntrinsicWidth();
                        } else {
                            intrinsicWidth = (int) (48 * Resources.getSystem().getDisplayMetrics().density);
                        }
                        if (drawable.getIntrinsicHeight() > 0) {
                            intrinsicHeight = drawable.getIntrinsicHeight();
                        } else {
                            intrinsicHeight = (int) (48 * Resources.getSystem().getDisplayMetrics().density);
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Rect bounds = drawable.getBounds();
                        i9.l.d(bounds, "getBounds(...)");
                        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        drawable.draw(canvas);
                        drawable.setBounds(bounds);
                        fVar = new y1.f(bitmapCreateBitmap);
                    }
                } else {
                    if (drawable.getIntrinsicWidth() > 0) {
                        intrinsicWidth = drawable.getIntrinsicWidth();
                    } else {
                        intrinsicWidth = (int) (48 * Resources.getSystem().getDisplayMetrics().density);
                    }
                    if (drawable.getIntrinsicHeight() > 0) {
                        intrinsicHeight = drawable.getIntrinsicHeight();
                    } else {
                        intrinsicHeight = (int) (48 * Resources.getSystem().getDisplayMetrics().density);
                    }
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                    Rect bounds2 = drawable.getBounds();
                    i9.l.d(bounds2, "getBounds(...)");
                    drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    drawable.draw(canvas2);
                    drawable.setBounds(bounds2);
                    fVar = new y1.f(bitmapCreateBitmap2);
                }
                y1.f fVar3 = fVar;
                r1.m mVar = r1.m.f11116a;
                n3.n.C(fVar3, null, androidx.compose.foundation.layout.c.h(mVar, 48), sVar3, 432, 248);
                a2.f.L(16, sVar3, mVar, sVar3);
                u2.b(j0Var2.f8196a, fillElement, 0L, n3.r.K(g5.a.n(16, sVar3), 4294967296L), null, 0L, new m3.k(3), 0L, 0, false, 1, 0, null, sVar3, 48, 3072, 122356);
                sVar3.p(true);
                break;
        }
        return t8.z.f12851a;
    }
}
