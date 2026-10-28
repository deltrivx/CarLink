package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f1079a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f1080b = new HashMap();

    public static void a(Constructor constructor, s sVar) {
        try {
            i9.l.b(constructor.newInstance(sVar));
            throw new ClassCastException();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x010b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        i9.b bVarH;
        Class cls2;
        boolean z10;
        HashMap map = f1079a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i7 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r8 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r8 != null ? r8.getName() : "";
                i9.l.b(name);
                if (name.length() != 0) {
                    i9.l.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    i9.l.d(canonicalName, "substring(...)");
                }
                i9.l.b(canonicalName);
                String strConcat = zb.q.n0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            }
            HashMap map2 = f1080b;
            if (declaredConstructor != null) {
                map2.put(cls, n3.l.I(declaredConstructor));
            } else {
                d dVar = d.f1024c;
                HashMap map3 = dVar.f1026b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((y) declaredMethods[i10].getAnnotation(y.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i10++;
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && s.class.isAssignableFrom(superclass)) {
                        i9.l.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            i9.l.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            bVarH = i9.l.h(cls.getInterfaces());
                            while (bVarH.hasNext()) {
                                cls2 = (Class) bVarH.next();
                                if (cls2 == null && s.class.isAssignableFrom(cls2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    i9.l.b(cls2);
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        i9.l.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        bVarH = i9.l.h(cls.getInterfaces());
                        while (bVarH.hasNext()) {
                            cls2 = (Class) bVarH.next();
                            if (cls2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                i9.l.b(cls2);
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    i9.l.b(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i7 = 2;
        }
        map.put(cls, Integer.valueOf(i7));
        return i7;
    }
}
