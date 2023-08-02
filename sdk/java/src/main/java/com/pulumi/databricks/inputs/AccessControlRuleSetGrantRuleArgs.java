// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessControlRuleSetGrantRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessControlRuleSetGrantRuleArgs Empty = new AccessControlRuleSetGrantRuleArgs();

    /**
     * a list of principals who are granted a role. The following format is supported:
     * * `users/{username}` (also exposed as `acl_principal_id` attribute of `databricks.User` resource).
     * * `groups/{groupname}` (also exposed as `acl_principal_id` attribute of `databricks.Group` resource).
     * * `servicePrincipals/{applicationId}` (also exposed as `acl_principal_id` attribute of `databricks.ServicePrincipal` resource).
     * 
     */
    @Import(name="principals")
    private @Nullable Output<List<String>> principals;

    /**
     * @return a list of principals who are granted a role. The following format is supported:
     * * `users/{username}` (also exposed as `acl_principal_id` attribute of `databricks.User` resource).
     * * `groups/{groupname}` (also exposed as `acl_principal_id` attribute of `databricks.Group` resource).
     * * `servicePrincipals/{applicationId}` (also exposed as `acl_principal_id` attribute of `databricks.ServicePrincipal` resource).
     * 
     */
    public Optional<Output<List<String>>> principals() {
        return Optional.ofNullable(this.principals);
    }

    /**
     * Role to be granted. The supported roles are listed below. For more information about these roles, refer to [service principal roles](https://docs.databricks.com/security/auth-authz/access-control/service-principal-acl.html#service-principal-roles).
     * * `roles/servicePrincipal.manager` - Manager of a service principal.
     * * `roles/servicePrincipal.user` - User of a service principal.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return Role to be granted. The supported roles are listed below. For more information about these roles, refer to [service principal roles](https://docs.databricks.com/security/auth-authz/access-control/service-principal-acl.html#service-principal-roles).
     * * `roles/servicePrincipal.manager` - Manager of a service principal.
     * * `roles/servicePrincipal.user` - User of a service principal.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private AccessControlRuleSetGrantRuleArgs() {}

    private AccessControlRuleSetGrantRuleArgs(AccessControlRuleSetGrantRuleArgs $) {
        this.principals = $.principals;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessControlRuleSetGrantRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessControlRuleSetGrantRuleArgs $;

        public Builder() {
            $ = new AccessControlRuleSetGrantRuleArgs();
        }

        public Builder(AccessControlRuleSetGrantRuleArgs defaults) {
            $ = new AccessControlRuleSetGrantRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principals a list of principals who are granted a role. The following format is supported:
         * * `users/{username}` (also exposed as `acl_principal_id` attribute of `databricks.User` resource).
         * * `groups/{groupname}` (also exposed as `acl_principal_id` attribute of `databricks.Group` resource).
         * * `servicePrincipals/{applicationId}` (also exposed as `acl_principal_id` attribute of `databricks.ServicePrincipal` resource).
         * 
         * @return builder
         * 
         */
        public Builder principals(@Nullable Output<List<String>> principals) {
            $.principals = principals;
            return this;
        }

        /**
         * @param principals a list of principals who are granted a role. The following format is supported:
         * * `users/{username}` (also exposed as `acl_principal_id` attribute of `databricks.User` resource).
         * * `groups/{groupname}` (also exposed as `acl_principal_id` attribute of `databricks.Group` resource).
         * * `servicePrincipals/{applicationId}` (also exposed as `acl_principal_id` attribute of `databricks.ServicePrincipal` resource).
         * 
         * @return builder
         * 
         */
        public Builder principals(List<String> principals) {
            return principals(Output.of(principals));
        }

        /**
         * @param principals a list of principals who are granted a role. The following format is supported:
         * * `users/{username}` (also exposed as `acl_principal_id` attribute of `databricks.User` resource).
         * * `groups/{groupname}` (also exposed as `acl_principal_id` attribute of `databricks.Group` resource).
         * * `servicePrincipals/{applicationId}` (also exposed as `acl_principal_id` attribute of `databricks.ServicePrincipal` resource).
         * 
         * @return builder
         * 
         */
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }

        /**
         * @param role Role to be granted. The supported roles are listed below. For more information about these roles, refer to [service principal roles](https://docs.databricks.com/security/auth-authz/access-control/service-principal-acl.html#service-principal-roles).
         * * `roles/servicePrincipal.manager` - Manager of a service principal.
         * * `roles/servicePrincipal.user` - User of a service principal.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Role to be granted. The supported roles are listed below. For more information about these roles, refer to [service principal roles](https://docs.databricks.com/security/auth-authz/access-control/service-principal-acl.html#service-principal-roles).
         * * `roles/servicePrincipal.manager` - Manager of a service principal.
         * * `roles/servicePrincipal.user` - User of a service principal.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public AccessControlRuleSetGrantRuleArgs build() {
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}