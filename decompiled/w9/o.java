package w9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import u8.f0;
import u8.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f14227a = f0.h0(pa.f.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f14228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f14229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f14230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f14231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f14232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f14233g;

    static {
        List<eb.c> listJ = n3.l.J(eb.c.BOOLEAN, eb.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (eb.c cVar : listJ) {
            wa.c cVar2 = cVar.f4681d;
            if (cVar2 == null) {
                eb.c.a(15);
                throw null;
            }
            String strB = cVar2.f14240a.f().b();
            i9.l.d(strB, "asString(...)");
            u.c0(pa.f.f(strB, cVar.f4679b + "Value()" + cVar.c()), linkedHashSet);
        }
        f14228b = f0.g0(f0.g0(f0.g0(f0.g0(f0.g0(f0.g0(linkedHashSet, pa.f.g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), pa.f.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), pa.f.f("Double", "isInfinite()Z", "isNaN()Z")), pa.f.f("Float", "isInfinite()Z", "isNaN()Z")), pa.f.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), pa.f.f("CharSequence", "isEmpty()Z"));
        f14229c = pa.f.g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f14230d = f0.g0(f0.g0(f0.g0(f0.g0(f0.g0(f0.g0(pa.f.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), pa.f.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), pa.f.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), pa.f.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), pa.f.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), pa.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), pa.f.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f14231e = f0.g0(f0.g0(pa.f.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), pa.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), pa.f.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        eb.c cVar3 = eb.c.BYTE;
        List listJ2 = n3.l.J(eb.c.BOOLEAN, cVar3, eb.c.DOUBLE, eb.c.FLOAT, cVar3, eb.c.INT, eb.c.LONG, eb.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listJ2.iterator();
        while (it.hasNext()) {
            wa.c cVar4 = ((eb.c) it.next()).f4681d;
            if (cVar4 == null) {
                eb.c.a(15);
                throw null;
            }
            String strB2 = cVar4.f14240a.f().b();
            i9.l.d(strB2, "asString(...)");
            String[] strArrA = pa.f.a("Ljava/lang/String;");
            u.c0(pa.f.f(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)), linkedHashSet2);
        }
        String[] strArrA2 = pa.f.a("D");
        LinkedHashSet linkedHashSetG0 = f0.g0(linkedHashSet2, pa.f.f("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = pa.f.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f14232f = f0.g0(linkedHashSetG0, pa.f.f("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = pa.f.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f14233g = pa.f.f("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
