package da;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends w implements na.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f3885a;

    public r(Constructor constructor) {
        i9.l.e(constructor, "member");
        this.f3885a = constructor;
    }

    @Override // da.w
    public final Member b() {
        return this.f3885a;
    }

    @Override // na.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f3885a.getTypeParameters();
        i9.l.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
