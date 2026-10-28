package w0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import f1.x2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x2 f13967a = new x2(new n8.f(28));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f13968b = new u();

    public static final void a(n0.a aVar, Context context, boolean z10, CharSequence charSequence, b3.q0 q0Var, t tVar, h9.k kVar) {
        if (Build.VERSION.SDK_INT < 28 || charSequence == null || q0Var == null || tVar == null || !(tVar instanceof t)) {
            kVar.invoke(aVar);
            if (charSequence == null || q0Var == null) {
                return;
            }
            m0.d.a(aVar, context, z10, charSequence, q0Var.f1430a);
            return;
        }
        long j5 = q0Var.f1430a;
        Object obj = tVar.f13934h;
        lc.c cVar = tVar.f13931e;
        TextClassification textClassification = null;
        if (cVar.e()) {
            i1 i1Var = (i1) tVar.f13933g.getValue();
            TextClassification textClassification2 = (i1Var != null && b3.q0.b(j5, i1Var.f13810b) && i9.l.a(charSequence, i1Var.f13809a)) ? i1Var.f13811c : null;
            cVar.f(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            kVar.invoke(aVar);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                aVar.f8700a.a(new o0.h(obj, textClassification, 0));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                aVar.f8700a.a(new o0.h(obj, textClassification, -1));
            }
            kVar.invoke(aVar);
            List actions = textClassification.getActions();
            int size = actions.size();
            for (int i7 = 0; i7 < size; i7++) {
                s1.i.s(actions.get(i7));
                if (i7 > 0) {
                    aVar.f8700a.a(new o0.h(obj, textClassification, i7));
                }
            }
        }
        m0.d.a(aVar, context, z10, charSequence, q0Var.f1430a);
    }

    public static final t b(x xVar, i3.b bVar, f1.s sVar, int i7) {
        sVar.W(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            sVar.p(false);
            return null;
        }
        Context context = (Context) sVar.j(r2.n0.f11343b);
        y8.h hVar = (y8.h) sVar.j(f13967a);
        boolean zF = ((((i7 & 112) ^ 48) > 32 && sVar.f(bVar)) || (i7 & 48) == 32) | sVar.f(hVar) | sVar.f(context);
        Object objK = sVar.K();
        if (zF || objK == f1.n.f5051a) {
            f13968b.getClass();
            objK = new t(hVar, context, xVar, bVar);
            sVar.h0(objK);
        }
        t tVar = (t) objK;
        sVar.p(false);
        return tVar;
    }
}
