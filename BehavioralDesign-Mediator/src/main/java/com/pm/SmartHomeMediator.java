package com.pm;

import com.pm.entity.SmartDevice;

public interface SmartHomeMediator {
    void notify(SmartDevice device, String event);
    void registerDevice(SmartDevice device);
}
