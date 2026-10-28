package da;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f3854b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f3855c = new c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f3856d = new c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3857e = new c(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3858a;

    public /* synthetic */ c(int i7) {
        this.f3858a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f3858a) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = d.f3860a;
                i9.l.e(parameterizedType, "it");
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = d.f3860a;
                i9.l.e(parameterizedType2, "it");
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                i9.l.d(actualTypeArguments, "getActualTypeArguments(...)");
                return u8.l.k0(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!wa.e.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return wa.e.e(simpleName);
                }
                return null;
        }
    }
}
