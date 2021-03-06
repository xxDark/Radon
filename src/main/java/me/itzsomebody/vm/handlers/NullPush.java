package me.itzsomebody.vm.handlers;

import me.itzsomebody.vm.VM;
import me.itzsomebody.vm.datatypes.JObject;

public class NullPush extends Handler {
    @Override
    public void handle(VM vm, Object[] operands) {
        vm.push(new JObject(null));
    }
}
