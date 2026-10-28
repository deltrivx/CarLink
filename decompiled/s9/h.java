package s9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends w implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12679f;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Constructor constructor, Object obj, int i7) {
        this.f12678e = i7;
        switch (i7) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                i9.l.d(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                i9.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f12679f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                i9.l.d(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                i9.l.d(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : u8.l.s0(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f12679f = obj;
                break;
        }
    }

    @Override // s9.g
    public final Object t(Object[] objArr) {
        switch (this.f12678e) {
            case 0:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                Constructor constructor = (Constructor) this.f12692a;
                e2.g gVar = new e2.g(3);
                gVar.a(this.f12679f);
                gVar.b(objArr);
                gVar.a(null);
                ArrayList arrayList = gVar.f4168a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                Constructor constructor2 = (Constructor) this.f12692a;
                e2.g gVar2 = new e2.g(2);
                gVar2.a(this.f12679f);
                gVar2.b(objArr);
                ArrayList arrayList2 = gVar2.f4168a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
