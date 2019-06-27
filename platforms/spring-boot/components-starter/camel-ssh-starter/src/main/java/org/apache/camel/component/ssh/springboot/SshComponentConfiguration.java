/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.ssh.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.sshd.common.keyprovider.KeyPairProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * The ssh component enables access to SSH servers such that you can send an SSH
 * command, and process the response.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.ssh")
public class SshComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the ssh component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared SSH configuration
     */
    private SshConfigurationNestedConfiguration configuration;
    /**
     * Sets the hostname of the remote SSH server.
     */
    private String host;
    /**
     * Sets the port number for the remote SSH server.
     */
    private Integer port;
    /**
     * Sets the username to use in logging into the remote SSH server.
     */
    private String username;
    /**
     * Sets the password to use in connecting to remote SSH server. Requires
     * keyPairProvider to be set to null.
     */
    private String password;
    /**
     * Sets the command string to send to the remote SSH server during every
     * poll cycle. Only works with camel-ssh component being used as a consumer,
     * i.e. from(ssh://...). You may need to end your command with a newline,
     * and that must be URL encoded %0A
     */
    private String pollCommand;
    /**
     * Sets the KeyPairProvider reference to use when connecting using
     * Certificates to the remote SSH Server. The option is a
     * org.apache.sshd.common.keyprovider.KeyPairProvider type.
     */
    private String keyPairProvider;
    /**
     * Sets the key type to pass to the KeyPairProvider as part of
     * authentication. KeyPairProvider.loadKey(...) will be passed this value.
     * Defaults to ssh-rsa.
     */
    private String keyType;
    /**
     * Sets the timeout in milliseconds to wait in establishing the remote SSH
     * server connection. Defaults to 30000 milliseconds.
     */
    private Long timeout;
    /**
     * Sets the resource path of the certificate to use for Authentication.
     */
    @Deprecated
    private String certFilename;
    /**
     * Sets the resource path of the certificate to use for Authentication. Will
     * use ResourceHelperKeyPairProvider to resolve file based certificate, and
     * depends on keyType setting.
     */
    private String certResource;
    /**
     * Sets the channel type to pass to the Channel as part of command
     * execution. Defaults to exec.
     */
    private String channelType;
    /**
     * Sets the shellPrompt to be dropped when response is read after command
     * execution
     */
    private String shellPrompt;
    /**
     * Sets the sleep period in milliseconds to wait reading response from shell
     * prompt. Defaults to 100 milliseconds.
     */
    private Long sleepForShellPrompt;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public SshConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            SshConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPollCommand() {
        return pollCommand;
    }

    public void setPollCommand(String pollCommand) {
        this.pollCommand = pollCommand;
    }

    public String getKeyPairProvider() {
        return keyPairProvider;
    }

    public void setKeyPairProvider(String keyPairProvider) {
        this.keyPairProvider = keyPairProvider;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public String getCertFilename() {
        return certFilename;
    }

    @Deprecated
    public void setCertFilename(String certFilename) {
        this.certFilename = certFilename;
    }

    public String getCertResource() {
        return certResource;
    }

    public void setCertResource(String certResource) {
        this.certResource = certResource;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getShellPrompt() {
        return shellPrompt;
    }

    public void setShellPrompt(String shellPrompt) {
        this.shellPrompt = shellPrompt;
    }

    public Long getSleepForShellPrompt() {
        return sleepForShellPrompt;
    }

    public void setSleepForShellPrompt(Long sleepForShellPrompt) {
        this.sleepForShellPrompt = sleepForShellPrompt;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class SshConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.ssh.SshConfiguration.class;
        /**
         * Sets the username to use in logging into the remote SSH server.
         */
        private String username;
        /**
         * Sets the hostname of the remote SSH server.
         */
        private String host;
        /**
         * Sets the port number for the remote SSH server.
         */
        private Integer port = 22;
        /**
         * Sets the password to use in connecting to remote SSH server. Requires
         * keyPairProvider to be set to null.
         */
        private String password;
        /**
         * Sets the command string to send to the remote SSH server during every
         * poll cycle. Only works with camel-ssh component being used as a
         * consumer, i.e. from(ssh://...) You may need to end your command with
         * a newline, and that must be URL encoded %0A
         */
        private String pollCommand;
        /**
         * Sets the KeyPairProvider reference to use when connecting using
         * Certificates to the remote SSH Server.
         */
        private KeyPairProvider keyPairProvider;
        /**
         * Sets the key type to pass to the KeyPairProvider as part of
         * authentication. KeyPairProvider.loadKey(...) will be passed this
         * value. From Camel 3.0.0 / 2.25.0, by default Camel will select the
         * first available KeyPair that is loaded. Prior to this, a KeyType of
         * 'ssh-rsa' was enforced by default.
         */
        private String keyType;
        /**
         * Sets the timeout in milliseconds to wait in establishing the remote
         * SSH server connection. Defaults to 30000 milliseconds.
         */
        private Long timeout = 30000L;
        /**
         * @deprecated As of version 2.11, replaced by
         *             {@link #setCertResource(String)}
         */
        @Deprecated
        private String certFilename;
        /**
         * Sets the resource path of the certificate to use for Authentication.
         * Will use ResourceHelperKeyPairProvider to resolve file based
         * certificate, and depends on keyType setting.
         */
        private String certResource;
        /**
         * Sets the resource path for a known_hosts file
         */
        private String knownHostsResource;
        /**
         * Specifies whether a connection to an unknown host should fail or not.
         * This value is only checked when the property knownHosts is set.
         */
        private Boolean failOnUnknownHost = false;
        /**
         * Sets the channel type to pass to the Channel as part of command
         * execution. Defaults to exec.
         */
        private String channelType = "exec";
        /**
         * Sets the shellPrompt to be dropped when response is read after
         * command execution
         */
        private String shellPrompt;
        /**
         * Sets the sleep period in milliseconds to wait reading response from
         * shell prompt. Defaults to 100 milliseconds.
         */
        private Long sleepForShellPrompt = 100L;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPollCommand() {
            return pollCommand;
        }

        public void setPollCommand(String pollCommand) {
            this.pollCommand = pollCommand;
        }

        public KeyPairProvider getKeyPairProvider() {
            return keyPairProvider;
        }

        public void setKeyPairProvider(KeyPairProvider keyPairProvider) {
            this.keyPairProvider = keyPairProvider;
        }

        public String getKeyType() {
            return keyType;
        }

        public void setKeyType(String keyType) {
            this.keyType = keyType;
        }

        public Long getTimeout() {
            return timeout;
        }

        public void setTimeout(Long timeout) {
            this.timeout = timeout;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public String getCertFilename() {
            return certFilename;
        }

        @Deprecated
        public void setCertFilename(String certFilename) {
            this.certFilename = certFilename;
        }

        public String getCertResource() {
            return certResource;
        }

        public void setCertResource(String certResource) {
            this.certResource = certResource;
        }

        public String getKnownHostsResource() {
            return knownHostsResource;
        }

        public void setKnownHostsResource(String knownHostsResource) {
            this.knownHostsResource = knownHostsResource;
        }

        public Boolean getFailOnUnknownHost() {
            return failOnUnknownHost;
        }

        public void setFailOnUnknownHost(Boolean failOnUnknownHost) {
            this.failOnUnknownHost = failOnUnknownHost;
        }

        public String getChannelType() {
            return channelType;
        }

        public void setChannelType(String channelType) {
            this.channelType = channelType;
        }

        public String getShellPrompt() {
            return shellPrompt;
        }

        public void setShellPrompt(String shellPrompt) {
            this.shellPrompt = shellPrompt;
        }

        public Long getSleepForShellPrompt() {
            return sleepForShellPrompt;
        }

        public void setSleepForShellPrompt(Long sleepForShellPrompt) {
            this.sleepForShellPrompt = sleepForShellPrompt;
        }
    }
}