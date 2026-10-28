package ka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f7467b;

    public /* synthetic */ p(q qVar, int i7) {
        this.f7466a = i7;
        this.f7467b = qVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f7466a) {
            case 0:
                q qVar = this.f7467b;
                pa.f fVar = ((ja.a) qVar.f7470h.f3847b).f6974l;
                String str = qVar.f364e.f14240a.f14243a;
                fVar.getClass();
                i9.l.e(str, "packageFqName");
                return u8.b0.Z0(new ArrayList());
            case 1:
                this.f7467b.f7469g.getClass();
                return new ArrayList(u8.q.a0(u8.w.f13122a, 10));
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) k9.a.z(this.f7467b.f7471i, q.f7468m[0])).entrySet()) {
                    String str2 = (String) entry.getKey();
                    ca.c cVar = (ca.c) entry.getValue();
                    eb.b bVarC = eb.b.c(str2);
                    qa.b bVar = cVar.f2577b;
                    qa.a aVar = bVar.f10999a;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 2) {
                        map.put(bVarC, bVarC);
                    } else if (iOrdinal == 5) {
                        String str3 = bVar.f11004f;
                        if (aVar != qa.a.MULTIFILE_CLASS_PART) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            map.put(bVarC, eb.b.c(str3));
                        }
                    }
                }
                return map;
        }
    }
}
