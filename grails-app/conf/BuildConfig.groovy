grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

String springSecurityVer = "3.1.4.RELEASE"
grails.release.scm.enabled = false

grails.project.repos.internalRepo.url = "http://subversion.assembla.com/svn/panteraproject/repos"
grails.plugin.repos.discovery.internalRepo = "http://subversion.assembla.com/svn/panteraproject/repos"
grails.plugin.repos.distribution.internalRepo = "http://subversion.assembla.com/svn/panteraproject/repos"

grails.project.repos.default = "internalRepo"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }

    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenRepo "http://maven.springframework.org/release"
        mavenRepo "http://repo1.maven.org/maven2"
    }
    dependencies {
        runtime('org.springframework.security:spring-security-core:'+springSecurityVer) {
            excludes 'com.springsource.javax.servlet',
                     'com.springsource.org.aopalliance',
                     'com.springsource.org.apache.commons.logging',
                     'com.springsource.org.apache.xmlcommons',
                     'org.springframework.aop',
                     'org.springframework.beans',
                     'org.springframework.context',
                     'org.springframework.core',
                     'org.springframework.web'

        }
        runtime('org.springframework.security:spring-security-web:'+springSecurityVer) {
            excludes 'com.springsource.javax.servlet',
                     'com.springsource.org.aopalliance',
                     'com.springsource.org.apache.commons.logging',
                     'com.springsource.org.apache.xmlcommons',
                     'org.springframework.aop',
                     'org.springframework.beans',
                     'org.springframework.context',
                     'org.springframework.core',
                     'org.springframework.web'
        }
        compile 'org.springframework.social:spring-social-twitter:1.0.3.RELEASE'
    }

    plugins {
        provided ':webxml:1.4.1'

        build ':release:3.0.1', ':rest-client-builder:1.0.3', {
            export = false
        }

        compile ':spring-security-core:2.0-RC2'
    }
}
