// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StorageCredentialGcpServiceAccountKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageCredentialGcpServiceAccountKeyArgs Empty = new StorageCredentialGcpServiceAccountKeyArgs();

    /**
     * The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey;
    }

    @Import(name="privateKeyId", required=true)
    private Output<String> privateKeyId;

    public Output<String> privateKeyId() {
        return this.privateKeyId;
    }

    private StorageCredentialGcpServiceAccountKeyArgs() {}

    private StorageCredentialGcpServiceAccountKeyArgs(StorageCredentialGcpServiceAccountKeyArgs $) {
        this.email = $.email;
        this.privateKey = $.privateKey;
        this.privateKeyId = $.privateKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCredentialGcpServiceAccountKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCredentialGcpServiceAccountKeyArgs $;

        public Builder() {
            $ = new StorageCredentialGcpServiceAccountKeyArgs();
        }

        public Builder(StorageCredentialGcpServiceAccountKeyArgs defaults) {
            $ = new StorageCredentialGcpServiceAccountKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email of the GCP service account created, to be granted access to relevant buckets.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email of the GCP service account created, to be granted access to relevant buckets.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder privateKeyId(Output<String> privateKeyId) {
            $.privateKeyId = privateKeyId;
            return this;
        }

        public Builder privateKeyId(String privateKeyId) {
            return privateKeyId(Output.of(privateKeyId));
        }

        public StorageCredentialGcpServiceAccountKeyArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.privateKey = Objects.requireNonNull($.privateKey, "expected parameter 'privateKey' to be non-null");
            $.privateKeyId = Objects.requireNonNull($.privateKeyId, "expected parameter 'privateKeyId' to be non-null");
            return $;
        }
    }

}
