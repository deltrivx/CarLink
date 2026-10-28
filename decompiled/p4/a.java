package p4;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f10133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f10135j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f10136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f10137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f10138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f10140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10142r;

    public a(u uVar) {
        uVar.A();
        k kVar = uVar.f10246t;
        if (kVar != null) {
            kVar.f10204d.getClassLoader();
        }
        this.f10126a = new ArrayList();
        this.f10139o = false;
        this.f10142r = -1;
        this.f10140p = uVar;
    }

    public final void a(a0 a0Var) {
        this.f10126a.add(a0Var);
        a0Var.f10146d = this.f10127b;
        a0Var.f10147e = this.f10128c;
        a0Var.f10148f = this.f10129d;
        a0Var.f10149g = this.f10130e;
    }

    public final void b(int i7) {
        if (this.f10132g) {
            if (u.D(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            ArrayList arrayList = this.f10126a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a0 a0Var = (a0) arrayList.get(i10);
                i iVar = a0Var.f10144b;
                if (iVar != null) {
                    iVar.f10191q += i7;
                    if (u.D(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + a0Var.f10144b + " to " + a0Var.f10144b.f10191q);
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.f10141q) {
            throw new IllegalStateException("commit already called");
        }
        if (u.D(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new c0());
            e("  ", printWriter, true);
            printWriter.close();
        }
        this.f10141q = true;
        if (this.f10132g) {
            this.f10142r = this.f10140p.f10236i.getAndIncrement();
        } else {
            this.f10142r = -1;
        }
        u uVar = this.f10140p;
        synchronized (uVar.f10228a) {
            try {
                if (uVar.f10246t == null) {
                    return;
                }
                uVar.f10228a.add(this);
                uVar.P();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i7, i iVar, String str) {
        String str2 = iVar.K;
        if (str2 != null) {
            q4.c.c(iVar, str2);
        }
        Class<?> cls = iVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = iVar.f10198x;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + iVar + ": was " + iVar.f10198x + " now " + str);
            }
            iVar.f10198x = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + iVar + " with tag " + str + " to container view with no id");
            }
            int i10 = iVar.f10196v;
            if (i10 != 0 && i10 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + iVar + ": was " + iVar.f10196v + " now " + i7);
            }
            iVar.f10196v = i7;
            iVar.f10197w = i7;
        }
        a(new a0(1, iVar));
        iVar.f10192r = this.f10140p;
    }

    public final void e(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f10133h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10142r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10141q);
            if (this.f10131f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f10131f));
            }
            if (this.f10127b != 0 || this.f10128c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10127b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10128c));
            }
            if (this.f10129d != 0 || this.f10130e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10129d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10130e));
            }
            if (this.f10134i != 0 || this.f10135j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10134i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f10135j);
            }
            if (this.k != 0 || this.f10136l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f10136l);
            }
        }
        ArrayList arrayList = this.f10126a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a0 a0Var = (a0) arrayList.get(i7);
            switch (a0Var.f10143a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + a0Var.f10143a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(a0Var.f10144b);
            if (z10) {
                if (a0Var.f10146d != 0 || a0Var.f10147e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(a0Var.f10146d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(a0Var.f10147e));
                }
                if (a0Var.f10148f != 0 || a0Var.f10149g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(a0Var.f10148f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(a0Var.f10149g));
                }
            }
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        if (u.D(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f10132g) {
            u uVar = this.f10140p;
            if (uVar.f10231d == null) {
                uVar.f10231d = new ArrayList();
            }
            uVar.f10231d.add(this);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10142r >= 0) {
            sb2.append(" #");
            sb2.append(this.f10142r);
        }
        if (this.f10133h != null) {
            sb2.append(" ");
            sb2.append(this.f10133h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
