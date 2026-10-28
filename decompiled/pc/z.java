package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f10523a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10524b = new s0("kotlin.time.Instant", nc.c.k);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        ac.d dVar = (ac.d) obj;
        i9.l.e(dVar, "value");
        sVar.r(dVar.toString());
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0479 A[EDGE_INSN: B:194:0x0479->B:196:0x04ae BREAK  A[LOOP:1: B:54:0x012d->B:59:0x0144]] */
    /* JADX WARN: Code duplicated, block: B:195:0x049c A[EDGE_INSN: B:195:0x049c->B:196:0x04ae BREAK  A[LOOP:1: B:54:0x012d->B:59:0x0144]] */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x0479, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x049c, please report this as an issue */
    @Override // mc.a
    public final Object c(oc.b bVar) {
        int i7;
        ac.h hVarG;
        int i10;
        int i11;
        int i12;
        char cCharAt;
        char cCharAt2;
        ac.d dVar = ac.d.f519c;
        String strL = bVar.l();
        i9.l.e(strL, "input");
        if (strL.length() == 0) {
            hVarG = new u0.k("An empty string is not a valid Instant", strL);
        } else {
            char cCharAt3 = strL.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i7 = 1;
            } else {
                cCharAt3 = ' ';
                i7 = 0;
            }
            int i13 = i7;
            int iCharAt = 0;
            while (i13 < strL.length() && '0' <= (cCharAt2 = strL.charAt(i13)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strL.charAt(i13) - '0');
                i13++;
            }
            int i14 = i13 - i7;
            if (i14 > 10) {
                hVarG = ac.f.h(strL, "Expected at most 10 digits for the year number, got " + i14 + " digits");
            } else if (i14 == 10 && i9.l.f(strL.charAt(i7), 50) >= 0) {
                hVarG = ac.f.h(strL, "Expected at most 9 digits for the year number or year 1000000000, got " + i14 + " digits");
            } else if (i14 < 4) {
                hVarG = ac.f.h(strL, "The year number must be padded to 4 digits, got " + i14 + " digits");
            } else if (cCharAt3 == '+' && i14 == 4) {
                hVarG = ac.f.h(strL, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i14 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i15 = i13 + 16;
                if (strL.length() >= i15) {
                    u0.k kVarG = ac.f.g(strL, "'-'", i13, new a8.y0(4));
                    if (kVarG != null) {
                        hVarG = kVarG;
                        break;
                    }
                    hVarG = ac.f.g(strL, "'-'", i13 + 3, new a8.y0(5));
                    if (hVarG == null && (hVarG = ac.f.g(strL, "'T' or 't'", i13 + 6, new a8.y0(6))) == null && (hVarG = ac.f.g(strL, "':'", i13 + 9, new a8.y0(7))) == null && (hVarG = ac.f.g(strL, "':'", i13 + 12, new a8.y0(8))) == null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= 10) {
                                int i17 = ac.f.i(i13 + 1, strL);
                                int i18 = ac.f.i(i13 + 4, strL);
                                int i19 = ac.f.i(i13 + 7, strL);
                                int i20 = ac.f.i(i13 + 10, strL);
                                int i21 = ac.f.i(i13 + 13, strL);
                                int i22 = i13 + 15;
                                if (strL.charAt(i22) == '.') {
                                    i22 = i15;
                                    int iCharAt2 = 0;
                                    while (i22 < strL.length() && '0' <= (cCharAt = strL.charAt(i22)) && cCharAt < ':') {
                                        iCharAt2 = (iCharAt2 * 10) + (strL.charAt(i22) - '0');
                                        i22++;
                                    }
                                    int i23 = i22 - i15;
                                    if (1 > i23 || i23 >= 10) {
                                        hVarG = ac.f.h(strL, "1..9 digits are supported for the fraction of the second, got " + i23 + " digits");
                                        break;
                                    }
                                    i10 = iCharAt2 * ac.f.f523a[9 - i23];
                                } else {
                                    i10 = 0;
                                }
                                if (i22 < strL.length()) {
                                    char cCharAt4 = strL.charAt(i22);
                                    if (cCharAt4 != '+' && cCharAt4 != '-') {
                                        if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                                            hVarG = ac.f.h(strL, "Expected the UTC offset at position " + i22 + ", got '" + cCharAt4 + '\'');
                                            break;
                                        }
                                        int i24 = i22 + 1;
                                        if (strL.length() != i24) {
                                            hVarG = ac.f.h(strL, "Extra text after the instant at position " + i24);
                                            break;
                                        }
                                        i11 = 0;
                                        if (1 <= i17) {
                                            hVarG = ac.f.h(strL, "Expected a month number in 1..12, got " + i17);
                                            break;
                                        }
                                        hVarG = ac.f.h(strL, "Expected a month number in 1..12, got " + i17);
                                        break;
                                    }
                                    int length = strL.length() - i22;
                                    if (length <= 9) {
                                        if (length % 3 == 0) {
                                            int i25 = 0;
                                            for (int i26 = 2; i25 < i26; i26 = 2) {
                                                int i27 = i22 + ac.f.f525c[i25];
                                                if (i27 >= strL.length()) {
                                                    break;
                                                }
                                                if (strL.charAt(i27) != ':') {
                                                    StringBuilder sbT = ob.a.t("Expected ':' at index ", ", got '", i27);
                                                    sbT.append(strL.charAt(i27));
                                                    sbT.append('\'');
                                                    hVarG = ac.f.h(strL, sbT.toString());
                                                    break;
                                                }
                                                i25++;
                                            }
                                            int i28 = 0;
                                            while (i28 < 6 && (i12 = ac.f.f526d[i28] + i22) < strL.length()) {
                                                char cCharAt5 = strL.charAt(i12);
                                                int i29 = i28;
                                                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                    StringBuilder sbT2 = ob.a.t("Expected an ASCII digit at index ", ", got '", i12);
                                                    sbT2.append(strL.charAt(i12));
                                                    sbT2.append('\'');
                                                    hVarG = ac.f.h(strL, sbT2.toString());
                                                    break;
                                                }
                                                i28 = i29 + 1;
                                            }
                                            int i30 = ac.f.i(i22 + 1, strL);
                                            int i31 = length > 3 ? ac.f.i(i22 + 4, strL) : 0;
                                            int i32 = length > 6 ? ac.f.i(i22 + 7, strL) : 0;
                                            if (i31 <= 59) {
                                                if (i32 <= 59) {
                                                    if (i30 > 17 && (i30 != 18 || i31 != 0 || i32 != 0)) {
                                                        hVarG = ac.f.h(strL, "Expected an offset in -18:00..+18:00, got " + strL.subSequence(i22, strL.length()).toString());
                                                        break;
                                                    }
                                                    i11 = ((i31 * 60) + (i30 * 3600) + i32) * (cCharAt4 == '-' ? -1 : 1);
                                                    if (1 <= i17 && i17 < 13) {
                                                        if (1 <= i18) {
                                                            int i33 = iCharAt & 3;
                                                            if (i18 > (i17 != 2 ? (i17 == 4 || i17 == 6 || i17 == 9 || i17 == 11) ? 30 : 31 : i33 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                                hVarG = ac.f.h(strL, "Expected a valid day-of-month for month " + i17 + " of year " + iCharAt + ", got " + i18);
                                                                break;
                                                            }
                                                            if (i19 <= 23) {
                                                                if (i20 <= 59) {
                                                                    if (i21 <= 59) {
                                                                        long j5 = iCharAt;
                                                                        long j10 = ((long) 365) * j5;
                                                                        long j11 = (j5 >= 0 ? ((j5 + ((long) 399)) / ((long) 400)) + (((((long) 3) + j5) / ((long) 4)) - ((((long) 99) + j5) / ((long) 100))) + j10 : j10 - ((j5 / ((long) (-400))) + ((j5 / ((long) (-4))) - (j5 / ((long) (-100)))))) + ((long) (((i17 * 367) - 362) / 12)) + ((long) (i18 - 1));
                                                                        if (i17 > 2) {
                                                                            j11 = (i33 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j11 - 2 : (-1) + j11;
                                                                        }
                                                                        hVarG = new ac.g(i10, (((j11 - ((long) 719528)) * ((long) 86400)) + ((long) (((i20 * 60) + (i19 * 3600)) + i21))) - ((long) i11));
                                                                        break;
                                                                    }
                                                                    hVarG = ac.f.h(strL, "Expected second-of-minute in 0..59, got " + i21);
                                                                    break;
                                                                }
                                                                hVarG = ac.f.h(strL, "Expected minute-of-hour in 0..59, got " + i20);
                                                                break;
                                                            }
                                                            hVarG = ac.f.h(strL, "Expected hour in 0..23, got " + i19);
                                                            break;
                                                        }
                                                        hVarG = ac.f.h(strL, "Expected a valid day-of-month for month " + i17 + " of year " + iCharAt + ", got " + i18);
                                                        break;
                                                    }
                                                    hVarG = ac.f.h(strL, "Expected a month number in 1..12, got " + i17);
                                                    break;
                                                }
                                                hVarG = ac.f.h(strL, "Expected offset-second-of-minute in 0..59, got " + i32);
                                                break;
                                            }
                                            hVarG = ac.f.h(strL, "Expected offset-minute-of-hour in 0..59, got " + i31);
                                            break;
                                        }
                                        hVarG = ac.f.h(strL, "Invalid UTC offset string \"" + strL.subSequence(i22, strL.length()).toString() + '\"');
                                        break;
                                    }
                                    hVarG = ac.f.h(strL, "The UTC offset string \"" + ac.f.l(16, strL.subSequence(i22, strL.length()).toString()) + "\" is too long");
                                    break;
                                }
                                hVarG = ac.f.h(strL, "The UTC offset at the end of the string is missing");
                                break;
                            }
                            kVarG = ac.f.g(strL, "an ASCII digit", ac.f.f524b[i16] + i13, new a8.y0(9));
                            if (kVarG != null) {
                                hVarG = kVarG;
                                break;
                            }
                            i16++;
                        }
                    }
                } else {
                    hVarG = ac.f.h(strL, "The input string is too short");
                }
            } else {
                hVarG = ac.f.h(strL, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return hVarG.toInstant();
    }

    @Override // mc.a
    public final nc.e d() {
        return f10524b;
    }
}
