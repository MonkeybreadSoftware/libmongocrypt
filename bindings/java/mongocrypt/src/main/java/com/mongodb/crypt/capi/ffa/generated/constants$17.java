// Generated by jextract

package com.mongodb.crypt.capi.ffa.generated;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$17 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$17() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_BOOLEAN,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(mongocrypt_crypto_fn.class, "apply", constants$17.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$17.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_BOOLEAN,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(mongocrypt_hmac_fn.class, "apply", constants$17.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$17.const$3
    );
}


