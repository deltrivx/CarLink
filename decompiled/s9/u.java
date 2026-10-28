package s9;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object[] f12690g;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Method method, Object[] objArr) {
        Collection collectionI;
        i9.l.e(method, "method");
        i9.l.e(objArr, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        i9.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = objArr.length;
        if (length < 0) {
            throw new IllegalArgumentException(a2.f.F("Requested element count ", " is less than zero.", length).toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(a2.f.F("Requested element count ", " is less than zero.", length2).toString());
        }
        if (length2 == 0) {
            collectionI = u8.w.f13122a;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionI = u8.l.L0(genericParameterTypes);
            } else if (length2 == 1) {
                collectionI = n3.l.I(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i7 = length3 - length2; i7 < length3; i7++) {
                    arrayList.add(genericParameterTypes[i7]);
                }
                collectionI = arrayList;
            }
        }
        super(method, false, (Type[]) collectionI.toArray(new Type[0]));
        this.f12690g = objArr;
    }

    @Override // s9.q, s9.g
    public final Object t(Object[] objArr) {
        i9.l.e(objArr, "args");
        n4.h.m(this, objArr);
        e2.g gVar = new e2.g(2);
        gVar.b(this.f12690g);
        gVar.b(objArr);
        ArrayList arrayList = gVar.f4168a;
        return c(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
