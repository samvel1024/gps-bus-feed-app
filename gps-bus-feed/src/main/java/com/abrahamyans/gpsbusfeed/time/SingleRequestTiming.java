package com.abrahamyans.gpsbusfeed.time;

import com.abrahamyans.gpsbusfeed.scheduler.RequestDate;

import java.util.Date;

/**
 * @author Samvel Abrahamyan
 */

public class SingleRequestTiming implements RequestTiming {

    private static final long serialVersionUID = 8220289725482643645L;

    public SingleRequestTiming(){
        super();
    }

    @Override
    public RequestDate nextRequestDate(Date lastRequestDate) {
        return lastRequestDate == null ? RequestDate.IMMEDIATELY : RequestDate.NEVER;
    }


}
