package w0;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import f1.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.h f13927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f13929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i3.b f13930d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextClassifier f13932f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lc.c f13931e = new lc.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.k1 f13933g = f1.b.s(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13934h = new Object();

    public t(y8.h hVar, Context context, x xVar, i3.b bVar) {
        this.f13927a = hVar;
        this.f13928b = context;
        this.f13929c = xVar;
        this.f13930d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(t tVar, CharSequence charSequence, long j5, TextClassifier textClassifier, a9.c cVar) {
        r rVar;
        long j10;
        CharSequence charSequence2;
        TextClassifier textClassifierK;
        lc.c cVar2;
        Object obj;
        TextClassification textClassificationClassifyText;
        long j11;
        CharSequence charSequence3;
        f1.k1 k1Var = tVar.f13933g;
        lc.c cVar3 = tVar.f13931e;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i7 = rVar.f13906g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                rVar.f13906g = i7 - Integer.MIN_VALUE;
            } else {
                rVar = new r(tVar, cVar);
            }
        } else {
            rVar = new r(tVar, cVar);
        }
        Object obj2 = rVar.f13904e;
        int i10 = rVar.f13906g;
        t8.z zVar = t8.z.f12851a;
        z8.a aVar = z8.a.f15774a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = rVar.f13903d;
                    cVar2 = rVar.f13902c;
                    textClassifierK = s1.i.k(rVar.f13901b);
                    charSequence2 = rVar.f13900a;
                    t8.a.e(obj2);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = rVar.f13903d;
                    cVar3 = rVar.f13902c;
                    textClassificationClassifyText = s1.i.i(rVar.f13901b);
                    charSequence3 = rVar.f13900a;
                    t8.a.e(obj2);
                }
                try {
                    k1Var.setValue(new i1(charSequence3, j11, textClassificationClassifyText));
                    return zVar;
                } finally {
                    cVar3.f(null);
                }
            }
            t8.a.e(obj2);
            rVar.f13900a = charSequence;
            rVar.f13901b = textClassifier;
            rVar.f13902c = cVar3;
            j10 = j5;
            rVar.f13903d = j10;
            rVar.f13906g = 1;
            if (cVar3.d(rVar) == aVar) {
                return aVar;
            }
            charSequence2 = charSequence;
            textClassifierK = textClassifier;
            cVar2 = cVar3;
            i1 i1Var = (i1) k1Var.getValue();
            if (i1Var != null) {
                x2 x2Var = v.f13967a;
                obj = null;
                if (b3.q0.b(j10, i1Var.f13810b) && i9.l.a(charSequence2, i1Var.f13809a)) {
                    cVar2.f(null);
                    return zVar;
                }
            } else {
                obj = null;
            }
            cVar2.f(obj);
            n8.e.p();
            textClassificationClassifyText = textClassifierK.classifyText(n8.e.d(charSequence2, b3.q0.f(j10), b3.q0.e(j10)).setDefaultLocales(tVar.b()).build());
            rVar.f13900a = charSequence2;
            rVar.f13901b = textClassificationClassifyText;
            rVar.f13902c = cVar3;
            rVar.f13903d = j10;
            rVar.f13906g = 2;
            if (cVar3.d(rVar) == aVar) {
                return aVar;
            }
            j11 = j10;
            charSequence3 = charSequence2;
            k1Var.setValue(new i1(charSequence3, j11, textClassificationClassifyText));
            return zVar;
        } catch (Throwable th) {
            cVar2.f(null);
            throw th;
        }
    }

    public final LocaleList b() {
        i3.b bVar = this.f13930d;
        if (bVar == null) {
            r2.g0.d();
            return r2.g0.c(new Locale[]{i3.d.f6616a.n().c().f6612a});
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
        Iterator it = bVar.f6614a.iterator();
        while (it.hasNext()) {
            arrayList.add(((i3.a) it.next()).f6612a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return r2.g0.c((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
