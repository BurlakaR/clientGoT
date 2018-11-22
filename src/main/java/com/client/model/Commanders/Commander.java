package com.client.model.Commanders;

import com.client.model.utils.Battle;

public abstract class Commander {
    private short force; //ranges from 0 to 4
    private Boolean isUsed = false;

    public Commander(short force) throws Exception {
        if(force >= 0 && force <= 4)
        {
            this.force = force;
        }
        else
        {
            throw new Exception("force ranges from 0 to 4");
        }
    }

    public abstract void ApplyCommander(Battle battle);

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }
}
