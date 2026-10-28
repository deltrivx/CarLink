package s9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, int i7) {
        super(member, type, cls, typeArr);
        this.f12680e = i7;
    }

    @Override // s9.g
    public final Object t(Object[] objArr) {
        switch (this.f12680e) {
            case 0:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                Constructor constructor = (Constructor) this.f12692a;
                e2.g gVar = new e2.g(2);
                gVar.b(objArr);
                gVar.a(null);
                ArrayList arrayList = gVar.f4168a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                return ((Constructor) this.f12692a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
