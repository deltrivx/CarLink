package oa;

import t8.z;

/* JADX INFO: loaded from: classes.dex */
public final class l implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9603b;

    public /* synthetic */ l(int i7, String str) {
        this.f9602a = i7;
        this.f9603b = str;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f9602a;
        z zVar = z.f12851a;
        String str = this.f9603b;
        p pVar = (p) obj;
        switch (i7) {
            case 0:
                i9.l.e(pVar, "$this$function");
                pVar.c(str, m.f9605b);
                break;
            case 1:
                i9.l.e(pVar, "$this$function");
                e eVar = m.f9605b;
                pVar.c(str, eVar, eVar);
                break;
            case 2:
                i9.l.e(pVar, "$this$function");
                e eVar2 = m.f9605b;
                pVar.a(str, eVar2, eVar2);
                break;
            case 3:
                i9.l.e(pVar, "$this$function");
                pVar.a(str, m.f9605b);
                break;
            case 4:
                i9.l.e(pVar, "$this$function");
                pVar.a(str, m.f9605b);
                break;
            case 5:
                i9.l.e(pVar, "$this$function");
                pVar.c(str, m.f9605b);
                break;
            default:
                i9.l.e(pVar, "$this$function");
                pVar.c(str, m.f9605b);
                break;
        }
        return zVar;
    }
}
