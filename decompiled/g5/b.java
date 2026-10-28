package g5;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f5921c;

    public b(f fVar, f fVar2, f fVar3) {
        this.f5919a = fVar;
        this.f5920b = fVar2;
        this.f5921c = fVar3;
    }

    public abstract c a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        f fVar = this.f5921c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        fVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        f fVar = this.f5919a;
        Method method = (Method) fVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        fVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        f fVar = this.f5920b;
        Method method = (Method) fVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, b.class);
        fVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i7);

    public final int f(int i7, int i10) {
        return !e(i10) ? i7 : ((c) this).f5923e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((c) this).f5923e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String string = ((c) this).f5923e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (d) c(string).invoke(null, a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void i(int i7);

    public final void j(int i7, int i10) {
        i(i10);
        ((c) this).f5923e.writeInt(i7);
    }

    public final void k(Parcelable parcelable, int i7) {
        i(i7);
        ((c) this).f5923e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).f5923e.writeString(null);
            return;
        }
        try {
            ((c) this).f5923e.writeString(b(dVar.getClass()).getName());
            c cVarA = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, cVarA);
                Parcel parcel = cVarA.f5923e;
                int i7 = cVarA.f5927i;
                if (i7 >= 0) {
                    int i10 = cVarA.f5922d.get(i7);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(iDataPosition - i10);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
