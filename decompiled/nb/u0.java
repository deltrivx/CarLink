package nb;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pb.i f9041a = pb.l.c(pb.k.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pb.i f9042b = pb.l.c(pb.k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f9043c = new t0("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f9044d = new t0("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 4 && i7 != 9 && i7 != 11 && i7 != 15 && i7 != 17 && i7 != 19 && i7 != 26 && i7 != 35 && i7 != 48 && i7 != 53 && i7 != 6 && i7 != 7) {
            switch (i7) {
                case 56:
                case 57:
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 4 && i7 != 9 && i7 != 11 && i7 != 15 && i7 != 17 && i7 != 19 && i7 != 26 && i7 != 35 && i7 != 48 && i7 != 53 && i7 != 6 && i7 != 7) {
            switch (i7) {
                case 56:
                case 57:
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                case 59:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 56:
            case 57:
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                objArr[0] = "projections";
                break;
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                objArr[0] = "a";
                break;
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                objArr[0] = "b";
                break;
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[0] = "typeParameters";
                break;
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                objArr[0] = "typeParameterConstructors";
                break;
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                objArr[0] = "specialType";
                break;
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                objArr[0] = "isSpecialType";
                break;
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                objArr[0] = "parameterDescriptor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
                objArr[0] = "supertypes";
                break;
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i7 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i7 == 11 || i7 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i7 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i7 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i7 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i7 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i7 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i7 != 53) {
            if (i7 != 6 && i7 != 7) {
                switch (i7) {
                    case 56:
                    case 57:
                    case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i7) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 56:
            case 57:
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[2] = "isNullableType";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[2] = "acceptsNullable";
                break;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                objArr[2] = "equalTypes";
                break;
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                objArr[2] = "contains";
                break;
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                objArr[2] = "makeStarProjection";
                break;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 9 && i7 != 11 && i7 != 15 && i7 != 17 && i7 != 19 && i7 != 26 && i7 != 35 && i7 != 48 && i7 != 53 && i7 != 6 && i7 != 7) {
            switch (i7) {
                case 56:
                case 57:
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(w wVar) {
        if (wVar == null) {
            a(28);
            throw null;
        }
        if (wVar.E0()) {
            return true;
        }
        return c.k(wVar) && b(((p) wVar.G0()).f9024c);
    }

    public static boolean c(w wVar, h9.k kVar, wb.i iVar) {
        if (wVar == null) {
            return false;
        }
        w0 w0VarG0 = wVar.G0();
        if (l(wVar)) {
            return ((Boolean) kVar.invoke(w0VarG0)).booleanValue();
        }
        if (iVar != null && iVar.contains(wVar)) {
            return false;
        }
        if (((Boolean) kVar.invoke(w0VarG0)).booleanValue()) {
            return true;
        }
        if (iVar == null) {
            int i7 = wb.i.f14296c;
            iVar = wb.l.e();
        }
        iVar.add(wVar);
        p pVar = w0VarG0 instanceof p ? (p) w0VarG0 : null;
        if (pVar != null && (c(pVar.f9023b, kVar, iVar) || c(pVar.f9024c, kVar, iVar))) {
            return true;
        }
        if ((w0VarG0 instanceof l) && c(((l) w0VarG0).f9015b, kVar, iVar)) {
            return true;
        }
        k0 k0VarD0 = wVar.D0();
        if (k0VarD0 instanceof v) {
            Iterator it = ((v) k0VarD0).f9046b.iterator();
            while (it.hasNext()) {
                if (c((w) it.next(), kVar, iVar)) {
                    return true;
                }
            }
            return false;
        }
        for (n0 n0Var : wVar.B0()) {
            if (!n0Var.c()) {
                if (c(n0Var.b(), kVar, iVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f0(((x9.r0) it.next()).n()));
        }
        return u8.p.J0(arrayList);
    }

    public static boolean e(w wVar) {
        if (wVar == null) {
            a(27);
            throw null;
        }
        if (!wVar.E0() && (!c.k(wVar) || !e(((p) wVar.G0()).f9024c))) {
            if (!(wVar.G0() instanceof l)) {
                if (f(wVar)) {
                    if (!(wVar.D0().l() instanceof x9.e)) {
                        r0 r0VarD = r0.d(wVar);
                        Collection<w> collectionM = wVar.D0().m();
                        ArrayList arrayList = new ArrayList(collectionM.size());
                        for (w wVar2 : collectionM) {
                            if (wVar2 == null) {
                                a(21);
                                throw null;
                            }
                            w wVarI = r0VarD.i(wVar2, x0.INVARIANT);
                            w wVarH = wVarI != null ? h(wVarI, wVar.E0()) : null;
                            if (wVarH != null) {
                                arrayList.add(wVarH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((w) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                k0 k0VarD0 = wVar.D0();
                if (k0VarD0 instanceof v) {
                    Iterator it2 = ((v) k0VarD0).f9046b.iterator();
                    while (it2.hasNext()) {
                        if (e((w) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(w wVar) {
        if (wVar == null) {
            a(60);
            throw null;
        }
        if ((wVar.D0().l() instanceof x9.r0 ? (x9.r0) wVar.D0().l() : null) != null) {
            return true;
        }
        wVar.D0();
        return false;
    }

    public static w0 g(w wVar, boolean z10) {
        if (wVar == null) {
            a(3);
            throw null;
        }
        w0 w0VarH0 = wVar.G0().H0(z10);
        if (w0VarH0 != null) {
            return w0VarH0;
        }
        a(4);
        throw null;
    }

    public static w h(w wVar, boolean z10) {
        if (wVar != null) {
            return z10 ? g(wVar, true) : wVar;
        }
        a(8);
        throw null;
    }

    public static a0 i(a0 a0Var, boolean z10) {
        if (a0Var == null) {
            a(5);
            throw null;
        }
        if (!z10) {
            return a0Var;
        }
        a0 a0VarK0 = a0Var.H0(true);
        if (a0VarK0 != null) {
            return a0VarK0;
        }
        a(6);
        throw null;
    }

    public static f0 j(x9.r0 r0Var) {
        if (r0Var != null) {
            return new f0(r0Var);
        }
        a(45);
        throw null;
    }

    public static n0 k(x9.r0 r0Var, la.a aVar) {
        if (r0Var != null) {
            return aVar.f8283a == s0.f9033a ? new f0(c.w(r0Var)) : new f0(r0Var);
        }
        a(46);
        throw null;
    }

    public static boolean l(w wVar) {
        if (wVar != null) {
            return wVar == f9043c || wVar == f9044d;
        }
        a(0);
        throw null;
    }
}
