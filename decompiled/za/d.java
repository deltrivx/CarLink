package za;

import aa.c0;
import aa.j0;
import aa.r0;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryScanner;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nb.k0;
import nb.w;
import x9.d0;
import x9.h0;
import x9.n;
import x9.o;
import x9.o0;
import x9.x;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15791a = 0;

    static {
        new wa.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 59:
            case 61:
            case 62:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 59:
            case 61:
            case 62:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case 57:
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 59:
            case 61:
            case 62:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[0] = "subClass";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
            case 66:
                objArr[0] = "type";
                break;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[0] = "other";
                break;
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                objArr[0] = "classKind";
                break;
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case Constants.VALUE_PROGRESS_70 /* 70 */:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i7) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 59:
            case 61:
            case 62:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[2] = "isDirectSubclass";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                objArr[2] = "isAnonymousObject";
                break;
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case Constants.VALUE_PROGRESS_70 /* 70 */:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
            case 50:
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 59:
            case 61:
            case 62:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(x9.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        Iterator it = bVar.a().m().iterator();
        while (it.hasNext()) {
            x9.b bVarA = ((x9.b) it.next()).a();
            b(bVarA, linkedHashSet);
            linkedHashSet.add(bVarA);
        }
    }

    public static x9.e c(w wVar) {
        if (wVar == null) {
            a(45);
            throw null;
        }
        k0 k0VarD0 = wVar.D0();
        if (k0VarD0 == null) {
            a(46);
            throw null;
        }
        x9.e eVar = (x9.e) k0VarD0.l();
        if (eVar != null) {
            return eVar;
        }
        a(47);
        throw null;
    }

    public static y d(x9.k kVar) {
        if (kVar == null) {
            a(21);
            throw null;
        }
        y yVarE = e(kVar);
        if (yVarE != null) {
            return yVarE;
        }
        a(22);
        throw null;
    }

    public static y e(x9.k kVar) {
        if (kVar == null) {
            a(23);
            throw null;
        }
        while (kVar != null) {
            if (kVar instanceof y) {
                return (y) kVar;
            }
            if (kVar instanceof h0) {
                return ((c0) ((h0) kVar)).f322c;
            }
            kVar = kVar.l();
        }
        return null;
    }

    public static o0 f(x9.k kVar) {
        o0 o0Var = o0.f14731b;
        if (kVar == null) {
            a(81);
            throw null;
        }
        if (kVar instanceof r0) {
            kVar = ((r0) kVar).C0();
        }
        if (kVar instanceof x9.l) {
            ((x9.l) kVar).getSource().getClass();
        }
        return o0Var;
    }

    public static wa.d g(x9.k kVar) {
        if (kVar != null) {
            wa.c cVarH = h(kVar);
            return cVarH != null ? cVarH.f14240a : g(kVar.l()).a(kVar.getName());
        }
        a(2);
        throw null;
    }

    public static wa.c h(x9.k kVar) {
        if (kVar == null) {
            a(5);
            throw null;
        }
        if ((kVar instanceof y) || pb.l.f(kVar)) {
            return wa.c.f14239c;
        }
        if (kVar instanceof h0) {
            return ((c0) ((h0) kVar)).f323d;
        }
        if (kVar instanceof d0) {
            return ((j0) ((d0) kVar)).f364e;
        }
        return null;
    }

    public static x9.k i(x9.k kVar, Class cls, boolean z10) {
        if (kVar == null) {
            return null;
        }
        if (z10) {
            kVar = kVar.l();
        }
        while (kVar != null) {
            if (cls.isInstance(kVar)) {
                return kVar;
            }
            kVar = kVar.l();
        }
        return null;
    }

    public static x9.e j(x9.e eVar) {
        if (eVar == null) {
            a(44);
            throw null;
        }
        Iterator it = eVar.t().m().iterator();
        while (it.hasNext()) {
            x9.e eVarC = c((w) it.next());
            if (eVarC.f() != x9.f.f14702b) {
                return eVarC;
            }
        }
        return null;
    }

    public static boolean k(x9.k kVar) {
        return n(kVar, x9.f.f14701a) && kVar.getName().equals(wa.g.f14251a);
    }

    public static boolean l(x9.k kVar) {
        return n(kVar, x9.f.f14706f) && ((x9.e) kVar).u();
    }

    public static boolean m(x9.k kVar) {
        if (kVar != null) {
            return n(kVar, x9.f.f14704d);
        }
        a(36);
        throw null;
    }

    public static boolean n(x9.k kVar, x9.f fVar) {
        return (kVar instanceof x9.e) && ((x9.e) kVar).f() == fVar;
    }

    public static boolean o(x9.k kVar) {
        if (kVar == null) {
            a(1);
            throw null;
        }
        while (kVar != null) {
            if (k(kVar) || ((kVar instanceof n) && ((n) kVar).d() == o.f14722f)) {
                return true;
            }
            kVar = kVar.l();
        }
        return false;
    }

    public static boolean p(w wVar, x9.k kVar) {
        if (wVar == null) {
            a(30);
            throw null;
        }
        if (kVar == null) {
            a(31);
            throw null;
        }
        x9.h hVarL = wVar.D0().l();
        if (hVarL == null) {
            return false;
        }
        x9.k kVarA = hVarL.a();
        return (kVarA instanceof x9.h) && (kVar instanceof x9.h) && ((x9.h) kVar).t().equals(((x9.h) kVarA).t());
    }

    public static boolean q(x9.k kVar) {
        return (n(kVar, x9.f.f14701a) || n(kVar, x9.f.f14702b)) && ((x9.e) kVar).i() == x.f14748c;
    }

    public static boolean r(w wVar, x9.k kVar) {
        if (wVar == null) {
            a(32);
            throw null;
        }
        if (kVar == null) {
            a(33);
            throw null;
        }
        if (p(wVar, kVar)) {
            return true;
        }
        Iterator it = wVar.D0().m().iterator();
        while (it.hasNext()) {
            if (r((w) it.next(), kVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(x9.k kVar) {
        return kVar != null && (kVar.l() instanceof d0);
    }

    public static x9.c t(x9.c cVar) {
        if (cVar == null) {
            a(58);
            throw null;
        }
        while (cVar.f() == 2) {
            Collection collectionM = cVar.m();
            if (collectionM.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + cVar);
            }
            cVar = (x9.c) collectionM.iterator().next();
        }
        return cVar;
    }
}
