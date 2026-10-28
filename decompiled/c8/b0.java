package c8;

import android.content.Context;
import android.content.IntentFilter;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import b8.n2;
import e8.z0;
import fc.h0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, y8.c cVar, int i7) {
        super(2, cVar);
        this.f2468a = i7;
        this.f2469b = obj;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f2468a) {
            case 0:
                return new b0((p1.p) this.f2469b, cVar, 0);
            case 1:
                return new b0((e8.q) this.f2469b, cVar, 1);
            case 2:
                return new b0((w1.o) this.f2469b, cVar, 2);
            case 3:
                return new b0((z0) this.f2469b, cVar, 3);
            case 4:
                return new b0((r3.t) this.f2469b, cVar, 4);
            default:
                return new b0((w0.t) this.f2469b, cVar, 5);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f2468a) {
            case 0:
                b0 b0Var = (b0) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                b0Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                b0 b0Var2 = (b0) create(yVar, cVar);
                t8.z zVar2 = t8.z.f12851a;
                b0Var2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                b0 b0Var3 = (b0) create(yVar, cVar);
                t8.z zVar3 = t8.z.f12851a;
                b0Var3.invokeSuspend(zVar3);
                return zVar3;
            case 3:
                b0 b0Var4 = (b0) create(yVar, cVar);
                t8.z zVar4 = t8.z.f12851a;
                b0Var4.invokeSuspend(zVar4);
                return zVar4;
            case 4:
                b0 b0Var5 = (b0) create(yVar, cVar);
                t8.z zVar5 = t8.z.f12851a;
                b0Var5.invokeSuspend(zVar5);
                return zVar5;
            default:
                return ((b0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        char[] cArr;
        String str;
        switch (this.f2468a) {
            case 0:
                t8.a.e(obj);
                t8.o oVar = n8.d.f8898a;
                qc.b bVar = qc.b.f11032d;
                j1.c cVar = p1.q.e((p1.p) this.f2469b).f10103c;
                bVar.getClass();
                pc.c cVar2 = new pc.c(n2.Companion.serializer());
                j.g gVar = new j.g(5);
                rc.c cVar3 = rc.c.f12317c;
                synchronized (cVar3) {
                    u8.k kVar = (u8.k) cVar3.f4401b;
                    cArr = (char[]) (kVar.isEmpty() ? null : kVar.removeLast());
                    if (cArr != null) {
                        cVar3.f4400a -= cArr.length;
                    } else {
                        cArr = null;
                    }
                    break;
                }
                if (cArr == null) {
                    cArr = new char[128];
                }
                gVar.f6795c = cArr;
                try {
                    rc.v vVar = rc.v.OBJ;
                    rc.s[] sVarArr = new rc.s[rc.v.f12375h.c()];
                    bVar.f11033a.getClass();
                    new rc.s(new e6.h(gVar), bVar, vVar, sVarArr).p(cVar2, cVar);
                    String string = gVar.toString();
                    gVar.i();
                    n8.d.g("TASKER_SEQUENCE", string);
                    h0 h0Var = n2.f1622h;
                    j1.c cVar4 = p1.q.e((p1.p) this.f2469b).f10103c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : cVar4) {
                        if (((n2) obj2).f1627e) {
                            arrayList.add(obj2);
                        }
                    }
                    h0Var.getClass();
                    h0Var.j(null, arrayList);
                    return t8.z.f12851a;
                } catch (Throwable th) {
                    gVar.i();
                    throw th;
                }
            case 1:
                t8.a.e(obj);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("AUTONAVI_STANDARD_BROADCAST_RECV");
                intentFilter.addAction("AUTONAVI_STANDARD_BROADCAST_SEND");
                u3.f.g(n8.a.b(), (e8.q) this.f2469b, intentFilter);
                return t8.z.f12851a;
            case 2:
                t8.a.e(obj);
                w1.o.b((w1.o) this.f2469b);
                return t8.z.f12851a;
            case 3:
                t8.a.e(obj);
                u3.f.g(n8.a.b(), (z0) this.f2469b, new IntentFilter("android.intent.action.MEDIA_BUTTON"));
                return t8.z.f12851a;
            case 4:
                t8.a.e(obj);
                ((r3.t) this.f2469b).show();
                return t8.z.f12851a;
            default:
                t8.a.e(obj);
                w0.t tVar = (w0.t) this.f2469b;
                Context context = tVar.f13928b;
                w0.x xVar = tVar.f13929c;
                TextClassificationManager textClassificationManagerJ = s1.i.j(context.getSystemService(s1.i.m()));
                int iOrdinal = xVar.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        throw new cc.s();
                    }
                    str = "textview";
                }
                n8.e.A();
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManagerJ.createTextClassificationSession(n8.e.g(context.getPackageName(), str).build());
                tVar.f13932f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
        }
    }
}
