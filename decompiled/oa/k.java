package oa;

import t8.z;

/* JADX INFO: loaded from: classes.dex */
public final class k implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9601c;

    public /* synthetic */ k(String str, String str2, int i7) {
        this.f9599a = i7;
        this.f9600b = str;
        this.f9601c = str2;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f9599a;
        z zVar = z.f12851a;
        String str = this.f9601c;
        String str2 = this.f9600b;
        p pVar = (p) obj;
        switch (i7) {
            case 0:
                i9.l.e(pVar, "$this$function");
                e eVar = m.f9605b;
                pVar.a(str2, eVar);
                e eVar2 = m.f9604a;
                pVar.a(str, eVar, eVar, eVar2, eVar2);
                pVar.c(str2, eVar2);
                break;
            case 1:
                i9.l.e(pVar, "$this$function");
                e eVar3 = m.f9605b;
                pVar.a(str2, eVar3);
                pVar.a(str, eVar3, eVar3, eVar3);
                pVar.c(str2, eVar3);
                break;
            case 2:
                i9.l.e(pVar, "$this$function");
                e eVar4 = m.f9605b;
                pVar.a(str2, eVar4);
                e eVar5 = m.f9604a;
                pVar.a(str, eVar4, eVar4, m.f9606c, eVar5);
                pVar.c(str2, eVar5);
                break;
            case 3:
                i9.l.e(pVar, "$this$function");
                e eVar6 = m.f9605b;
                pVar.a(str2, eVar6);
                e eVar7 = m.f9606c;
                pVar.a(str2, eVar7);
                e eVar8 = m.f9604a;
                pVar.a(str, eVar6, eVar7, eVar7, eVar8);
                pVar.c(str2, eVar8);
                break;
            case 4:
                i9.l.e(pVar, "$this$function");
                e eVar9 = m.f9606c;
                pVar.a(str2, eVar9);
                pVar.c(str, m.f9605b, eVar9);
                break;
            default:
                i9.l.e(pVar, "$this$function");
                pVar.a(str2, m.f9604a);
                pVar.c(str, m.f9605b, m.f9606c);
                break;
        }
        return zVar;
    }
}
