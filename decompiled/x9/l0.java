package x9;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14710b;

    public /* synthetic */ l0(int i7, Object obj) {
        this.f14709a = i7;
        this.f14710b = obj;
    }

    @Override // h9.a
    public final Object invoke() throws IllegalAccessException {
        int i7 = this.f14709a;
        Object obj = this.f14710b;
        switch (i7) {
            case 0:
                return (gb.o) ((m0) obj).f14714b.invoke(ob.g.f9640a);
            case 1:
                y9.j jVar = (y9.j) obj;
                return jVar.f15132a.j(jVar.f15133b).n();
            default:
                ya.k kVar = ((ya.g) obj).f15196a;
                ya.k kVar2 = new ya.k();
                i9.b bVarH = i9.l.h(ya.k.class.getDeclaredFields());
                while (bVarH.hasNext()) {
                    Field field = (Field) bVarH.next();
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj2 = field.get(kVar);
                        ya.j jVar2 = obj2 instanceof ya.j ? (ya.j) obj2 : null;
                        if (jVar2 != null) {
                            String name = field.getName();
                            i9.l.d(name, "getName(...)");
                            zb.q.o0(name, "is");
                            o9.c cVarB = i9.y.f6689a.b(ya.k.class);
                            field.getName();
                            String name2 = field.getName();
                            i9.l.d(name2, "getName(...)");
                            if (name2.length() > 0) {
                                Character.toUpperCase(name2.charAt(0));
                                i9.l.d(name2.substring(1), "substring(...)");
                            }
                            ((i9.e) cVarB).a();
                            field.set(kVar2, new ya.j(jVar2.f15215a, kVar2));
                        }
                    }
                }
                ya.g gVar = ya.g.f15193c;
                kVar2.L.b(u8.f0.g0(kVar2.m(), n3.l.J(u9.n.f13186p, u9.n.f13187q)), ya.k.Y[36]);
                kVar2.f15217a = true;
                return new ya.g(kVar2);
        }
    }
}
