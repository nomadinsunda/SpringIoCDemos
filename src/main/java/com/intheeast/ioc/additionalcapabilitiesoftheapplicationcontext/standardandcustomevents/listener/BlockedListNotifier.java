package com.intheeast.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.listener;


import org.springframework.context.ApplicationListener;

import com.intheeast.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.event.BlockedListEvent;

// An ApplicationListener can generically declare the event type 
// that it is interested in. 
// When registered with a Spring ApplicationContext, 
// events will be filtered accordingly, 
// with the listener getting invoked for matching event objects only.
public class BlockedListNotifier implements ApplicationListener<BlockedListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    // 누군가(Spring IoC 컨테이너)가 BlockedListEvent 이벤트를 발행하면,
    // Spring IoC 컨테이너에 의해 호출
    @Override
    public void onApplicationEvent(BlockedListEvent event) {
        System.out.printf("🔔 [%s] 알림: 차단된 이메일 감지 - %s%n",
                notificationAddress, event.getBlockedEmail());
    }
}
