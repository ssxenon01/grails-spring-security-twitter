package com.the6hours.grails.springsecurity.twitter

/**
 * TODO
 *
 * @since 18.07.11
 * @author Igor Artamonov (http://igorartamonov.com)
 */
public interface TwitterAuthListener {

    void userCreated(TwitterUserDomain user)

    void tokenUpdated(TwitterUserDomain user)
}