package u9;

import aa.h0;
import aa.j0;
import aa.q0;
import aa.r0;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryScanner;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nb.a0;
import nb.n0;
import nb.u0;
import nb.w;
import nb.w0;
import nb.x0;
import o9.e0;
import x9.d0;
import x9.f0;
import x9.k0;
import x9.t;
import x9.v;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wa.e f13141e = wa.e.g("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f13142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.i f13143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.e f13144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.k f13145d;

    public i(mb.k kVar) {
        this.f13145d = kVar;
        kVar.a(new f(this, 0));
        this.f13143b = new mb.i(kVar, new f(this, 1));
        this.f13144c = kVar.b(new g(this, 0));
    }

    public static boolean A(x9.k kVar) {
        if (kVar != null) {
            return za.d.i(kVar, kb.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(w wVar, wa.d dVar) {
        if (wVar == null) {
            a(97);
            throw null;
        }
        if (dVar != null) {
            return I(wVar.D0(), dVar);
        }
        a(98);
        throw null;
    }

    public static boolean C(w wVar, wa.d dVar) {
        if (dVar != null) {
            return B(wVar, dVar) && !wVar.E0();
        }
        a(135);
        throw null;
    }

    public static boolean D(t tVar) {
        if (tVar.a().getAnnotations().i(n.f13183m)) {
            return true;
        }
        if (!(tVar instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) tVar;
        boolean zD0 = k0Var.d0();
        q0 q0VarB = k0Var.b();
        r0 r0VarC = k0Var.c();
        if (q0VarB == null || !D(q0VarB)) {
            return false;
        }
        if (zD0) {
            return r0VarC != null && D(r0VarC);
        }
        return true;
    }

    public static boolean E(w wVar, wa.d dVar) {
        if (wVar == null) {
            a(105);
            throw null;
        }
        if (dVar != null) {
            return !wVar.E0() && B(wVar, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean F(w wVar) {
        if (wVar == null) {
            a(136);
            throw null;
        }
        if (wVar != null) {
            return B(wVar, n.f13167b) && !u0.e(wVar);
        }
        a(138);
        throw null;
    }

    public static boolean G(w wVar) {
        if (wVar.E0()) {
            return false;
        }
        x9.h hVarL = wVar.D0().l();
        return (hVarL instanceof x9.e) && u((x9.e) hVarL) != null;
    }

    public static boolean H(w wVar) {
        return E(wVar, n.f13175f);
    }

    public static boolean I(nb.k0 k0Var, wa.d dVar) {
        if (k0Var == null) {
            a(101);
            throw null;
        }
        if (dVar != null) {
            x9.h hVarL = k0Var.l();
            return (hVarL instanceof x9.e) && b((x9.e) hVarL, dVar);
        }
        a(102);
        throw null;
    }

    public static boolean J(x9.h hVar) {
        if (hVar == null) {
            a(10);
            throw null;
        }
        for (x9.k kVarL = hVar; kVarL != null; kVarL = kVarL.l()) {
            if (kVarL instanceof d0) {
                return ((j0) ((d0) kVarL)).f364e.c(o.f13206j);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:33:0x0058 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 11 && i7 != 13 && i7 != 15 && i7 != 69 && i7 != 74 && i7 != 81 && i7 != 84 && i7 != 86 && i7 != 87) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                                case 50:
                                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                        case ServiceTypes.KEYCODE_TEL /* 29 */:
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                        case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                        case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                        case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                        case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                        case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                        case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 11 && i7 != 13 && i7 != 15 && i7 != 69 && i7 != 74 && i7 != 81 && i7 != 84 && i7 != 86 && i7 != 87) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            i10 = 3;
                                            break;
                                    }
                                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                                case 50:
                                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                                    i10 = 2;
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                        case ServiceTypes.KEYCODE_TEL /* 29 */:
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                        case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                        case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                        case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                        case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                        case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                        case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                            i10 = 2;
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i10 = 2;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 55:
            case 56:
            case 57:
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case Constants.VALUE_PROGRESS_70 /* 70 */:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i7 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i7 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i7 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i7 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i7 == 81 || i7 == 84) {
            objArr[1] = "getArrayType";
        } else if (i7 == 86) {
            objArr[1] = "getEnumType";
        } else if (i7 != 87) {
            switch (i7) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i7) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                            objArr[1] = "getKProperty1";
                            break;
                        case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                            objArr[1] = "getKProperty2";
                            break;
                        case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case ServiceTypes.KEYCODE_TEL /* 29 */:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                            objArr[1] = "getMutableIterable";
                            break;
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                            objArr[1] = "getMutableIterator";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                            objArr[1] = "getCollection";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                            objArr[1] = "getMutableCollection";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                            objArr[1] = "getList";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                            objArr[1] = "getMutableList";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                            objArr[1] = "getSet";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                            objArr[1] = "getMutableSet";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                            objArr[1] = "getMap";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                            objArr[1] = "getMutableMap";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                            objArr[1] = "getMapEntry";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                            objArr[1] = "getListIterator";
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i7) {
                                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                                    objArr[1] = "getAnyType";
                                    break;
                                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i7) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i7) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 55:
            case 56:
            case 57:
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case Constants.VALUE_PROGRESS_70 /* 70 */:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 11 && i7 != 13 && i7 != 15 && i7 != 69 && i7 != 74 && i7 != 81 && i7 != 84 && i7 != 86 && i7 != 87) {
            switch (i7) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i7) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                        case ServiceTypes.KEYCODE_TEL /* 29 */:
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                        case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                        case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                        case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                        case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                        case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                        case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                            break;
                        default:
                            switch (i7) {
                                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                                case 50:
                                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                                    break;
                                default:
                                    switch (i7) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(x9.e eVar, wa.d dVar) {
        if (eVar == null) {
            a(103);
            throw null;
        }
        if (dVar != null) {
            return eVar.getName().equals(dVar.f()) && dVar.equals(za.d.g(eVar));
        }
        a(104);
        throw null;
    }

    public static k s(x9.h hVar) {
        if (hVar == null) {
            a(77);
            throw null;
        }
        if (n.f13174e0.contains(hVar.getName())) {
            return (k) n.f13178g0.get(za.d.g(hVar));
        }
        return null;
    }

    public static k u(x9.e eVar) {
        if (n.f13172d0.contains(eVar.getName())) {
            return (k) n.f13176f0.get(za.d.g(eVar));
        }
        return null;
    }

    public static boolean y(w wVar) {
        if (wVar != null) {
            return B(wVar, n.f13166a);
        }
        a(139);
        throw null;
    }

    public static boolean z(w wVar) {
        if (wVar != null) {
            return B(wVar, n.f13177g);
        }
        a(88);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, t8.h] */
    public final void c() {
        wa.e eVar = f13141e;
        i9.l.e(eVar, "moduleName");
        mb.k kVar = this.f13145d;
        h0 h0Var = new h0(eVar, kVar, this, 48);
        this.f13142a = h0Var;
        c.f13132a.getClass();
        c cVar = (c) b.f13131b.getValue();
        h0 h0Var2 = this.f13142a;
        Iterable iterableM = m();
        z9.d dVarQ = q();
        z9.b bVarD = d();
        ((kb.b) cVar).getClass();
        i9.l.e(h0Var2, "builtInsModule");
        i9.l.e(iterableM, "classDescriptorFactories");
        i9.l.e(dVarQ, "platformDependentDeclarationFilter");
        i9.l.e(bVarD, "additionalClassPartsProvider");
        Set<wa.c> set = o.f13212q;
        i9.l.e(set, "packageFqNames");
        ArrayList arrayList = new ArrayList();
        for (wa.c cVar2 : set) {
            kb.a.f7495m.getClass();
            String strA = kb.a.a(cVar2);
            i9.l.e(strA, "p0");
            InputStream inputStreamL = kb.d.l(strA);
            kb.c cVarP = inputStreamL != null ? e0.p(cVar2, kVar, h0Var2, inputStreamL) : null;
            if (cVarP != null) {
                arrayList.add(cVarP);
            }
        }
        f0 f0Var = new f0(arrayList);
        da.a aVar = new da.a(kVar, h0Var2);
        a2.d dVar = new a2.d(28, f0Var);
        kb.a aVar2 = kb.a.f7495m;
        jb.i iVar = new jb.i(kVar, h0Var2, dVar, new android.support.v4.media.session.r(h0Var2, aVar, aVar2), f0Var, iterableM, aVar, bVarD, dVarQ, aVar2.f6690a, null, new kb.d(kVar), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kb.c) it.next()).D0(iVar);
        }
        h0Var.f348h = f0Var;
        h0 h0Var3 = this.f13142a;
        h0Var3.getClass();
        h0Var3.f347g = new aa.f0(u8.l.L0(new h0[]{h0Var3}));
    }

    public z9.b d() {
        return z9.a.f15784b;
    }

    public final a0 e() {
        a0 a0VarN = k("Any").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(51);
        throw null;
    }

    public final w f(w wVar) {
        if (wVar == null) {
            a(68);
            throw null;
        }
        w wVarG = g(wVar);
        if (wVarG != null) {
            return wVarG;
        }
        throw new IllegalStateException("not array: " + wVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final w g(w wVar) {
        wa.b bVarF;
        wa.b bVar;
        x9.e eVarD;
        a0 a0VarN;
        if (wVar == null) {
            a(70);
            throw null;
        }
        if (!z(wVar)) {
            w0 w0VarG = u0.g(wVar, false);
            w wVar2 = (w) ((h) this.f13143b.invoke()).f13140b.get(w0VarG);
            if (wVar2 != null) {
                return wVar2;
            }
            int i7 = za.d.f15791a;
            x9.h hVarL = w0VarG.D0().l();
            y yVarE = hVarL == null ? null : za.d.e(hVarL);
            if (yVarE != null) {
                x9.h hVarL2 = w0VarG.D0().l();
                if (hVarL2 == null) {
                    a0VarN = null;
                } else {
                    Set set = s.f13224a;
                    wa.e name = hVarL2.getName();
                    i9.l.e(name, "name");
                    if (!s.f13227d.contains(name) || (bVarF = db.e.f(hVarL2)) == null || (bVar = (wa.b) s.f13225b.get(bVarF)) == null || (eVarD = v.d(yVarE, bVar)) == null) {
                        a0VarN = null;
                    } else {
                        a0VarN = eVarD.n();
                    }
                }
                if (a0VarN != null) {
                    return a0VarN;
                }
            }
        } else if (wVar.B0().size() == 1) {
            return ((n0) wVar.B0().get(0)).b();
        }
        return null;
    }

    public final a0 h(w0 w0Var) {
        if (w0Var != null) {
            return i(x0.INVARIANT, w0Var, y9.g.f15129a);
        }
        a(83);
        throw null;
    }

    public final a0 i(x0 x0Var, w wVar, y9.h hVar) {
        if (wVar != null) {
            return nb.c.s(nb.c.B(hVar), k("Array"), Collections.singletonList(new nb.f0(wVar, x0Var)));
        }
        a(79);
        throw null;
    }

    public final x9.e j(wa.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        x9.e eVarJ = v.j(l(), cVar);
        if (eVarJ != null) {
            return eVarJ;
        }
        a(13);
        throw null;
    }

    public final x9.e k(String str) {
        if (str != null) {
            return (x9.e) this.f13144c.invoke(wa.e.e(str));
        }
        a(14);
        throw null;
    }

    public final h0 l() {
        this.f13142a.getClass();
        h0 h0Var = this.f13142a;
        if (h0Var != null) {
            return h0Var;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new v9.a(this.f13145d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final a0 n() {
        a0 a0VarP = p();
        if (a0VarP != null) {
            return a0VarP;
        }
        a(53);
        throw null;
    }

    public final a0 o() {
        a0 a0VarN = k("Nothing").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(49);
        throw null;
    }

    public final a0 p() {
        a0 a0VarK0 = e().H0(true);
        if (a0VarK0 != null) {
            return a0VarK0;
        }
        a(52);
        throw null;
    }

    public z9.d q() {
        return z9.a.f15786d;
    }

    public final a0 r(k kVar) {
        if (kVar == null) {
            a(73);
            throw null;
        }
        a0 a0Var = (a0) ((h) this.f13143b.invoke()).f13139a.get(kVar);
        if (a0Var != null) {
            return a0Var;
        }
        a(74);
        throw null;
    }

    public final a0 t(k kVar) {
        if (kVar == null) {
            a(54);
            throw null;
        }
        a0 a0VarN = k(kVar.f13157a.b()).n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(55);
        throw null;
    }

    public final a0 v() {
        a0 a0VarN = k("String").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(66);
        throw null;
    }

    public final x9.e w(int i7) {
        return j(o.f13202f.a(wa.e.e(v9.j.f13700c.f13702b + i7)));
    }

    public final a0 x() {
        a0 a0VarN = k("Unit").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(65);
        throw null;
    }
}
