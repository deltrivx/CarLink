package o9;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r9.o1;
import r9.r1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9550a;

    public b0(v vVar) {
        this.f9550a = vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        r1 r1Var = ((o1) this.f9550a).f11737b;
        u uVar = o1.f11735d[0];
        Object objInvoke = r1Var.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        List list = (List) objInvoke;
        ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e0.n((i9.m) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new cc.a0(3, ob.a.q("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f9550a));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((o1) this.f9550a).a();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
