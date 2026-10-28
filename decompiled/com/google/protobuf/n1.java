package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f2804a;

    static {
        char[] cArr = new char[80];
        f2804a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i7) {
        while (i7 > 0) {
            int i10 = 80;
            if (i7 <= 80) {
                i10 = i7;
            }
            sb2.append(f2804a, 0, i10);
            i7 -= i10;
        }
    }

    public static void b(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(sb2, i7);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(k9.a.s(l.m((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof l) {
            sb2.append(": \"");
            sb2.append(k9.a.s((l) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof j0) {
            sb2.append(" {");
            c((j0) obj, sb2, i7 + 2);
            sb2.append("\n");
            a(sb2, i7);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i7 + 2;
        b(sb2, i11, "key", entry.getKey());
        b(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        a(sb2, i7);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:108:0x020c  */
    /* JADX WARN: Code duplicated, block: B:127:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x018e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0192  */
    /* JADX WARN: Code duplicated, block: B:75:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dd  */
    public static void c(j0 j0Var, StringBuilder sb2, int i7) {
        int i10;
        Method method;
        Method method2;
        Object objInvokeOrDie;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = j0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method5 = declaredMethods[i11];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i10);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null) {
                if (method4.getReturnType().equals(List.class)) {
                    b(sb2, i7, strSubstring.substring(0, strSubstring.length() - 4), j0.invokeOrDie(method4, j0Var, new Object[0]));
                }
                i10 = 3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb2, i7, strSubstring.substring(0, strSubstring.length() - 3), j0.invokeOrDie(method3, j0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objInvokeOrDie = j0.invokeOrDie(method, j0Var, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objInvokeOrDie instanceof Boolean) {
                                    zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                                } else if (objInvokeOrDie instanceof Integer) {
                                    if (((Integer) objInvokeOrDie).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof String) {
                                    zEquals = objInvokeOrDie.equals("");
                                } else if (objInvokeOrDie instanceof l) {
                                    zEquals = objInvokeOrDie.equals(l.f2785b);
                                } else if ((objInvokeOrDie instanceof l1) ? !((objInvokeOrDie instanceof Enum) && ((Enum) objInvokeOrDie).ordinal() == 0) : objInvokeOrDie != ((l1) objInvokeOrDie).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) j0.invokeOrDie(method2, j0Var, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb2, i7, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objInvokeOrDie = j0.invokeOrDie(method, j0Var, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objInvokeOrDie instanceof Boolean) {
                                zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                            } else if (objInvokeOrDie instanceof Integer) {
                                if (((Integer) objInvokeOrDie).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objInvokeOrDie instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objInvokeOrDie instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objInvokeOrDie instanceof String) {
                                zEquals = objInvokeOrDie.equals("");
                            } else if (objInvokeOrDie instanceof l) {
                                zEquals = objInvokeOrDie.equals(l.f2785b);
                            } else if (objInvokeOrDie instanceof l1) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) j0.invokeOrDie(method2, j0Var, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb2, i7, strSubstring, objInvokeOrDie);
                        }
                    }
                }
            }
            i10 = 3;
        }
        a2 a2Var = j0Var.unknownFields;
        if (a2Var != null) {
            for (int i12 = 0; i12 < a2Var.f2713a; i12++) {
                b(sb2, i7, String.valueOf(a2Var.f2714b[i12] >>> 3), a2Var.f2715c[i12]);
            }
        }
    }
}
