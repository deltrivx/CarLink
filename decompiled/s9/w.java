package s9;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Member f12692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f12693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f12694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12695d;

    public w(Member member, Type type, Class cls, Type[] typeArr) {
        List listL0;
        this.f12692a = member;
        this.f12693b = type;
        this.f12694c = cls;
        if (cls != null) {
            e2.g gVar = new e2.g(2);
            ArrayList arrayList = gVar.f4168a;
            gVar.a(cls);
            gVar.b(typeArr);
            listL0 = n3.l.J(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listL0 = u8.l.L0(typeArr);
        }
        this.f12695d = listL0;
    }

    public void a(Object[] objArr) {
        n4.h.m(this, objArr);
    }

    public final void b(Object obj) {
        if (obj == null || !this.f12692a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // s9.g
    public final Type p() {
        return this.f12693b;
    }

    @Override // s9.g
    public final List q() {
        return this.f12695d;
    }

    @Override // s9.g
    public final Member r() {
        return this.f12692a;
    }

    @Override // s9.g
    public final boolean s() {
        return false;
    }
}
