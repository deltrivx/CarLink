package za;

import aa.a0;
import aa.n0;
import aa.p0;
import aa.r0;
import aa.y0;
import aa.z;
import c8.y;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryScanner;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import nb.j0;
import nb.w;
import nb.w0;
import u8.p;
import u8.q;
import x9.k0;
import x9.o;
import x9.t;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15798b = p.J0(ServiceLoader.load(e.class, e.class.getClassLoader()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f15799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15800d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.d f15801a;

    static {
        b bVar = new b();
        f15800d = bVar;
        f15799c = new j(bVar);
    }

    public j(ob.d dVar) {
        if (dVar != null) {
            this.f15801a = dVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:33:0x0058 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 11 && i7 != 12 && i7 != 16 && i7 != 21 && i7 != 93 && i7 != 96 && i7 != 101 && i7 != 42 && i7 != 43) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 11 && i7 != 12 && i7 != 16 && i7 != 21 && i7 != 93 && i7 != 96 && i7 != 101 && i7 != 42 && i7 != 43) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            i10 = 3;
                                            break;
                                    }
                                case 78:
                                case 79:
                                case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                                case 81:
                                case 82:
                                    i10 = 2;
                                    break;
                            }
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                            i10 = 2;
                            break;
                    }
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    i10 = 2;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case 78:
            case 79:
            case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[0] = "subDescriptor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                objArr[0] = "firstParameters";
                break;
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                objArr[0] = "secondParameters";
                break;
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                objArr[0] = "typeInSuper";
                break;
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                objArr[0] = "typeInSub";
                break;
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                objArr[0] = "superTypeParameter";
                break;
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                objArr[0] = "membersFromCurrent";
                break;
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case Constants.VALUE_PROGRESS_70 /* 70 */:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i7 == 11 || i7 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i7 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i7 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i7 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i7 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i7 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i7 != 42 && i7 != 43) {
            switch (i7) {
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i7) {
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i7) {
                                case 78:
                                case 79:
                                case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i7) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case 78:
            case 79:
            case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                objArr[2] = "createTypeCheckerState";
                break;
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                objArr[2] = "areTypesEquivalent";
                break;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case Constants.VALUE_PROGRESS_70 /* 70 */:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 11 && i7 != 12 && i7 != 16 && i7 != 21 && i7 != 93 && i7 != 96 && i7 != 101 && i7 != 42 && i7 != 43) {
            switch (i7) {
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    break;
                default:
                    switch (i7) {
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                            break;
                        default:
                            switch (i7) {
                                case 78:
                                case 79:
                                case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
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

    public static boolean b(w wVar, w wVar2, j0 j0Var) {
        if (wVar == null) {
            a(44);
            throw null;
        }
        if (wVar2 == null) {
            a(45);
            throw null;
        }
        if (nb.c.j(wVar) && nb.c.j(wVar2)) {
            return true;
        }
        return nb.d.h(j0Var, wVar.G0(), wVar2.G0());
    }

    public static void c(x9.c cVar, LinkedHashSet linkedHashSet) {
        if (cVar == null) {
            a(17);
            throw null;
        }
        if (cVar.f() != 2) {
            linkedHashSet.add(cVar);
            return;
        }
        if (cVar.m().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + cVar);
        }
        Iterator it = cVar.m().iterator();
        while (it.hasNext()) {
            c((x9.c) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(x9.b bVar) {
        a0 a0VarE0 = bVar.e0();
        ArrayList arrayList = new ArrayList();
        if (a0VarE0 != null) {
            arrayList.add(a0VarE0.getType());
        }
        Iterator it = bVar.X().iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    public static void e(Collection collection, x9.e eVar, k kVar) {
        x xVar;
        boolean z10;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (eVar == null) {
            a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        boolean zG = eVar.G();
                        x xVar2 = x.f14750e;
                        if (zG && eVar.i() != xVar2 && eVar.i() != x.f14748c) {
                            z11 = true;
                        }
                        if (z12 && !z13) {
                            xVar = x.f14749d;
                            break;
                        }
                        if (!z12 && z13) {
                            x xVarI = z11 ? eVar.i() : xVar2;
                            if (xVarI != null) {
                                xVar = xVarI;
                                break;
                            } else {
                                a(90);
                                throw null;
                            }
                        }
                        HashSet<x9.c> hashSet = new HashSet();
                        for (x9.c cVar : collection) {
                            if (cVar == null) {
                                a(15);
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            c(cVar, linkedHashSet);
                            hashSet.addAll(linkedHashSet);
                        }
                        if (!hashSet.isEmpty() && db.e.j((x9.k) hashSet.iterator().next()).V(ob.h.f9641a) != null) {
                            throw new ClassCastException();
                        }
                        if (hashSet.size() > 1) {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (Object obj : hashSet) {
                                Iterator it3 = linkedHashSet2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        linkedHashSet2.add(obj);
                                        break;
                                    }
                                    x9.b bVar = (x9.b) obj;
                                    x9.b bVar2 = (x9.b) it3.next();
                                    if (!q(bVar, bVar2)) {
                                        if (q(bVar2, bVar)) {
                                            break;
                                        }
                                    } else {
                                        it3.remove();
                                    }
                                }
                            }
                            hashSet = linkedHashSet2;
                        }
                        x xVarI2 = eVar.i();
                        if (xVarI2 == null) {
                            a(92);
                            throw null;
                        }
                        x xVar3 = xVar2;
                        for (x9.c cVar2 : hashSet) {
                            x xVarI3 = (z11 && cVar2.i() == xVar2) ? xVarI2 : cVar2.i();
                            if (xVarI3.compareTo(xVar3) < 0) {
                                xVar3 = xVarI3;
                            }
                        }
                        if (xVar3 != null) {
                            xVar = xVar3;
                            break;
                        } else {
                            a(93);
                            throw null;
                        }
                    }
                    x9.c cVar3 = (x9.c) it2.next();
                    int iOrdinal = cVar3.i().ordinal();
                    if (iOrdinal == 0) {
                        xVar = x.f14747b;
                        break;
                    }
                    if (iOrdinal == 1) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + cVar3);
                    }
                    if (iOrdinal == 2) {
                        z12 = true;
                    } else if (iOrdinal == 3) {
                        z13 = true;
                    }
                }
                x9.c cVarW = ((x9.c) s(collection, new h(0))).W(eVar, xVar, zIsEmpty ? o.f14724h : o.f14723g);
                kVar.p(cVarW, collection);
                kVar.b(cVarW);
                return;
            }
            Object next = it.next();
            x9.c cVar4 = (x9.c) next;
            if (!o.e(cVar4.d())) {
                if (cVar4 == null) {
                    o.a(2);
                    throw null;
                }
                if (eVar == null) {
                    o.a(3);
                    throw null;
                }
                z10 = o.c(o.f14727l, cVar4, eVar) == null;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, h9.k kVar, h9.k kVar2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        x9.b bVar = (x9.b) kVar.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            x9.b bVar2 = (x9.b) kVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(bVar, bVar2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    kVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static i i(x9.b bVar, x9.b bVar2) {
        boolean z10;
        i iVarC;
        if (bVar == null) {
            a(38);
            throw null;
        }
        if (bVar2 == null) {
            a(39);
            throw null;
        }
        boolean z11 = bVar instanceof t;
        if ((z11 && !(bVar2 instanceof t)) || (((z10 = bVar instanceof k0)) && !(bVar2 instanceof k0))) {
            return i.c("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.getName().equals(bVar2.getName())) {
            return i.c("Name mismatch");
        }
        if ((bVar.e0() == null) != (bVar2.e0() == null)) {
            iVarC = i.c("Receiver presence mismatch");
        } else {
            iVarC = bVar.X().size() != bVar2.X().size() ? i.c("Value parameter number mismatch") : null;
        }
        if (iVarC != null) {
            return iVarC;
        }
        return null;
    }

    public static int j(x9.b bVar, x9.b bVar2) {
        j jVar = f15799c;
        int iB = jVar.l(bVar2, bVar, null).b();
        int iB2 = jVar.m(bVar, bVar2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(x9.b bVar, x9.b bVar2) {
        if (bVar == null) {
            a(65);
            throw null;
        }
        if (bVar2 == null) {
            a(66);
            throw null;
        }
        w wVarP = bVar.p();
        w wVarP2 = bVar2.p();
        if (!p(bVar, bVar2)) {
            return false;
        }
        j0 j0VarF = f15799c.f(bVar.getTypeParameters(), bVar2.getTypeParameters());
        if (bVar instanceof t) {
            return o(bVar, wVarP, bVar2, wVarP2, j0VarF);
        }
        if (!(bVar instanceof k0)) {
            throw new IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        k0 k0Var = (k0) bVar;
        k0 k0Var2 = (k0) bVar2;
        r0 r0VarC = k0Var.c();
        r0 r0VarC2 = k0Var2.c();
        if (!((r0VarC == null || r0VarC2 == null) ? true : p(r0VarC, r0VarC2))) {
            return false;
        }
        if (k0Var.d0() && k0Var2.d0()) {
            return nb.d.h(j0VarF, wVarP.G0(), wVarP2.G0());
        }
        return (k0Var.d0() || !k0Var2.d0()) && o(bVar, wVarP, bVar2, wVarP2, j0VarF);
    }

    public static boolean o(x9.b bVar, w wVar, x9.b bVar2, w wVar2, j0 j0Var) {
        if (bVar == null) {
            a(71);
            throw null;
        }
        if (wVar == null) {
            a(72);
            throw null;
        }
        if (bVar2 == null) {
            a(73);
            throw null;
        }
        if (wVar2 == null) {
            a(74);
            throw null;
        }
        w0 w0VarG0 = wVar.G0();
        w0 w0VarG1 = wVar2.G0();
        if (w0VarG0 == w0VarG1) {
            return true;
        }
        if (j0Var.b(w0VarG0, w0VarG1)) {
            return nb.d.f(j0Var, w0VarG0, w0VarG1);
        }
        return false;
    }

    public static boolean p(x9.b bVar, x9.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 != null) {
            Integer numB = o.b(bVar.d(), bVar2.d());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(x9.b bVar, x9.b bVar2) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = bVar.equals(bVar2);
        b bVar3 = b.f15790a;
        if (!zEquals && bVar3.c(bVar.a(), bVar2.a(), false)) {
            return true;
        }
        x9.b bVarA = bVar2.a();
        int i7 = d.f15791a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d.b(bVar.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (bVar3.c(bVarA, (x9.b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(x9.c cVar, h9.k kVar) {
        ga.o oVar;
        ga.o oVarF;
        ga.o oVar2;
        if (cVar == null) {
            a(105);
            throw null;
        }
        for (x9.c cVar2 : cVar.m()) {
            if (cVar2.d() == o.f14723g) {
                r(cVar2, kVar);
            }
        }
        if (cVar.d() != o.f14723g) {
            return;
        }
        Collection<x9.c> collectionM = cVar.m();
        if (collectionM == null) {
            a(107);
            throw null;
        }
        if (!collectionM.isEmpty()) {
            Iterator it = collectionM.iterator();
            loop3: while (true) {
                oVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    ga.o oVarD = ((x9.c) it.next()).d();
                    if (oVar != null) {
                        Integer numB = o.b(oVarD, oVar);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    oVar = oVarD;
                }
            }
            if (oVar == null) {
                oVarF = null;
                break;
            }
            Iterator it2 = collectionM.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    oVarF = oVar;
                    break;
                }
                Integer numB2 = o.b(oVar, ((x9.c) it2.next()).d());
                if (numB2 == null || numB2.intValue() < 0) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = o.f14726j;
        }
        if (oVarF == null) {
            oVarF = null;
            break;
        }
        if (cVar.f() == 2) {
            for (x9.c cVar3 : collectionM) {
                if (cVar3.i() != x.f14750e && !cVar3.d().equals(oVarF)) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = o.f(oVarF.f6101a.k());
        }
        if (oVarF == null) {
            if (kVar != null) {
                kVar.invoke(cVar);
            }
            oVar2 = o.f14721e;
        } else {
            oVar2 = oVarF;
        }
        if (cVar instanceof p0) {
            p0 p0Var = (p0) cVar;
            if (oVar2 == null) {
                p0.D(20);
                throw null;
            }
            p0Var.f408j = oVar2;
            Iterator it3 = ((k0) cVar).r().iterator();
            while (it3.hasNext()) {
                r((x9.j0) it3.next(), oVarF == null ? null : kVar);
            }
            return;
        }
        if (cVar instanceof z) {
            z zVar = (z) cVar;
            if (oVar2 != null) {
                zVar.f482l = oVar2;
                return;
            } else {
                z.D(10);
                throw null;
            }
        }
        n0 n0Var = (n0) cVar;
        n0Var.k = oVar2;
        if (oVar2 != n0Var.C0().d()) {
            n0Var.f380e = false;
        }
    }

    public static Object s(Collection collection, h9.k kVar) {
        Object next;
        if (collection.size() == 1) {
            Object objJ0 = p.j0(collection);
            if (objJ0 != null) {
                return objJ0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(q.a0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(kVar.invoke(it.next()));
        }
        Object objJ1 = p.j0(collection);
        x9.b bVar = (x9.b) kVar.invoke(objJ1);
        for (Object obj : collection) {
            x9.b bVar2 = (x9.b) kVar.invoke(obj);
            if (bVar2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(bVar2, (x9.b) it2.next()));
            if (k(bVar2, bVar) && !k(bVar, bVar2)) {
                objJ1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objJ1 != null) {
                return objJ1;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objJ2 = p.j0(arrayList);
            if (objJ2 != null) {
                return objJ2;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (nb.c.k(((x9.b) kVar.invoke(next)).p()));
        if (next != null) {
            return next;
        }
        Object objJ3 = p.j0(arrayList);
        if (objJ3 != null) {
            return objJ3;
        }
        a(82);
        throw null;
    }

    public final j0 f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        ob.d dVar = this.f15801a;
        if (zIsEmpty) {
            return new u0.k((HashMap) null, dVar).Z0();
        }
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < list.size(); i7++) {
            map.put(((x9.r0) list.get(i7)).t(), ((x9.r0) list2.get(i7)).t());
        }
        return new u0.k(map, dVar).Z0();
    }

    public final void h(wa.e eVar, Collection collection, Collection collection2, x9.e eVar2, k kVar) {
        Integer numB;
        if (eVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (eVar2 == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            x9.c cVar = (x9.c) it.next();
            if (cVar == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i7 = wb.i.f14296c;
            wb.i iVarE = wb.l.e();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                x9.c cVar2 = (x9.c) it2.next();
                int iB = l(cVar2, cVar, eVar2).b();
                boolean z10 = !o.e(cVar2.d()) && o.c(o.f14727l, cVar2, cVar) == null;
                int iB2 = e1.d.b(iB);
                if (iB2 == 0) {
                    if (z10) {
                        iVarE.add(cVar2);
                    }
                    arrayList.add(cVar2);
                } else if (iB2 == 2) {
                    if (z10) {
                        kVar.d(cVar2, cVar);
                    }
                    arrayList.add(cVar2);
                }
            }
            kVar.p(cVar, iVarE);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            x9.k kVarL = ((x9.c) linkedHashSet.iterator().next()).l();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((x9.c) it3.next()).l() != kVarL) {
                        LinkedList<x9.c> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            x9.c cVar3 = null;
                            for (x9.c cVar4 : linkedList) {
                                if (cVar3 == null || ((numB = o.b(cVar3.d(), cVar4.d())) != null && numB.intValue() < 0)) {
                                    cVar3 = cVar4;
                                }
                            }
                            i9.l.b(cVar3);
                            e(g(cVar3, linkedList, new h(1), new y(11, kVar, cVar3)), eVar2, kVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((x9.c) it4.next()), eVar2, kVar);
        }
    }

    public final i l(x9.b bVar, x9.b bVar2, x9.e eVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 != null) {
            return m(bVar, bVar2, eVar, false);
        }
        a(20);
        throw null;
    }

    public final i m(x9.b bVar, x9.b bVar2, x9.e eVar, boolean z10) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        i iVarN = n(bVar, bVar2, z10);
        boolean z11 = iVarN.b() == 1;
        List<e> list = f15798b;
        for (e eVar2 : list) {
            if (eVar2.a() != 1 && (!z11 || eVar2.a() != 2)) {
                int iB = e1.d.b(eVar2.b(bVar, bVar2, eVar));
                if (iB == 0) {
                    z11 = true;
                } else if (iB == 1) {
                    return i.c("External condition");
                }
            }
        }
        if (!z11) {
            return iVarN;
        }
        for (e eVar3 : list) {
            if (eVar3.a() == 1) {
                int iB2 = e1.d.b(eVar3.b(bVar, bVar2, eVar));
                if (iB2 == 0) {
                    throw new IllegalStateException("Contract violation in " + eVar3.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iB2 == 1) {
                    return i.c("External condition");
                }
            }
        }
        i iVar = i.f15795c;
        if (iVar != null) {
            return iVar;
        }
        i.a(0);
        throw null;
    }

    public final i n(x9.b bVar, x9.b bVar2, boolean z10) {
        if (bVar == null) {
            a(28);
            throw null;
        }
        if (bVar2 == null) {
            a(29);
            throw null;
        }
        i iVarI = i(bVar, bVar2);
        if (iVarI != null) {
            return iVarI;
        }
        ArrayList arrayListD = d(bVar);
        ArrayList arrayListD2 = d(bVar2);
        List typeParameters = bVar.getTypeParameters();
        List typeParameters2 = bVar2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i7 = 0; i7 < arrayListD.size(); i7++) {
                if (!ob.e.f9637a.a((w) arrayListD.get(i7), (w) arrayListD2.get(i7))) {
                    return i.c("Type parameter number mismatch");
                }
            }
            return new i(3, "Type parameter number mismatch");
        }
        j0 j0VarF = f(typeParameters, typeParameters2);
        for (int i10 = 0; i10 < typeParameters.size(); i10++) {
            x9.r0 r0Var = (x9.r0) typeParameters.get(i10);
            x9.r0 r0Var2 = (x9.r0) typeParameters2.get(i10);
            if (r0Var == null) {
                a(47);
                throw null;
            }
            if (r0Var2 == null) {
                a(48);
                throw null;
            }
            List<w> upperBounds = r0Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(r0Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (w wVar : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(wVar, (w) listIterator.next(), j0VarF));
                    listIterator.remove();
                }
            }
            return i.c("Type parameter bounds mismatch");
        }
        for (int i11 = 0; i11 < arrayListD.size(); i11++) {
            if (!b((w) arrayListD.get(i11), (w) arrayListD2.get(i11), j0VarF)) {
                return i.c("Value parameter type mismatch");
            }
        }
        if ((bVar instanceof t) && (bVar2 instanceof t) && ((t) bVar).o() != ((t) bVar2).o()) {
            return new i(3, "Incompatible suspendability");
        }
        if (z10) {
            w wVarP = bVar.p();
            w wVarP2 = bVar2.p();
            if (wVarP != null && wVarP2 != null && (!nb.c.j(wVarP2) || !nb.c.j(wVarP))) {
                w0 w0VarG0 = wVarP2.G0();
                w0 w0VarG1 = wVarP.G0();
                if (!(w0VarG0 == w0VarG1 ? true : nb.d.f(j0VarF, w0VarG0, w0VarG1))) {
                    return new i(3, "Return type mismatch");
                }
            }
        }
        i iVar = i.f15795c;
        if (iVar != null) {
            return iVar;
        }
        i.a(0);
        throw null;
    }
}
