// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePrincipalState extends com.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalState Empty = new ServicePrincipalState();

    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     * 
     */
    @Import(name="allowClusterCreate")
    private @Nullable Output<Boolean> allowClusterCreate;

    /**
     * @return Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     * 
     */
    public Optional<Output<Boolean>> allowClusterCreate() {
        return Optional.ofNullable(this.allowClusterCreate);
    }

    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    @Import(name="allowInstancePoolCreate")
    private @Nullable Output<Boolean> allowInstancePoolCreate;

    /**
     * @return Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    public Optional<Output<Boolean>> allowInstancePoolCreate() {
        return Optional.ofNullable(this.allowInstancePoolCreate);
    }

    /**
     * This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     * 
     */
    @Import(name="databricksSqlAccess")
    private @Nullable Output<Boolean> databricksSqlAccess;

    /**
     * @return This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     * 
     */
    public Optional<Output<Boolean>> databricksSqlAccess() {
        return Optional.ofNullable(this.databricksSqlAccess);
    }

    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return This is an alias for the service principal and can be the full name of the service principal.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * ID of the service principal in an external identity provider.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return ID of the service principal in an external identity provider.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    @Import(name="force")
    private @Nullable Output<Boolean> force;

    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     * 
     */
    @Import(name="home")
    private @Nullable Output<String> home;

    /**
     * @return Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     * 
     */
    public Optional<Output<String>> home() {
        return Optional.ofNullable(this.home);
    }

    /**
     * Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     * 
     */
    @Import(name="repos")
    private @Nullable Output<String> repos;

    /**
     * @return Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     * 
     */
    public Optional<Output<String>> repos() {
        return Optional.ofNullable(this.repos);
    }

    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     * 
     */
    @Import(name="workspaceAccess")
    private @Nullable Output<Boolean> workspaceAccess;

    /**
     * @return This is a field to allow the group to have access to Databricks Workspace.
     * 
     */
    public Optional<Output<Boolean>> workspaceAccess() {
        return Optional.ofNullable(this.workspaceAccess);
    }

    private ServicePrincipalState() {}

    private ServicePrincipalState(ServicePrincipalState $) {
        this.active = $.active;
        this.allowClusterCreate = $.allowClusterCreate;
        this.allowInstancePoolCreate = $.allowInstancePoolCreate;
        this.applicationId = $.applicationId;
        this.databricksSqlAccess = $.databricksSqlAccess;
        this.displayName = $.displayName;
        this.externalId = $.externalId;
        this.force = $.force;
        this.home = $.home;
        this.repos = $.repos;
        this.workspaceAccess = $.workspaceAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePrincipalState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePrincipalState $;

        public Builder() {
            $ = new ServicePrincipalState();
        }

        public Builder(ServicePrincipalState defaults) {
            $ = new ServicePrincipalState(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param allowClusterCreate Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
         * 
         * @return builder
         * 
         */
        public Builder allowClusterCreate(@Nullable Output<Boolean> allowClusterCreate) {
            $.allowClusterCreate = allowClusterCreate;
            return this;
        }

        /**
         * @param allowClusterCreate Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
         * 
         * @return builder
         * 
         */
        public Builder allowClusterCreate(Boolean allowClusterCreate) {
            return allowClusterCreate(Output.of(allowClusterCreate));
        }

        /**
         * @param allowInstancePoolCreate Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
         * 
         * @return builder
         * 
         */
        public Builder allowInstancePoolCreate(@Nullable Output<Boolean> allowInstancePoolCreate) {
            $.allowInstancePoolCreate = allowInstancePoolCreate;
            return this;
        }

        /**
         * @param allowInstancePoolCreate Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
         * 
         * @return builder
         * 
         */
        public Builder allowInstancePoolCreate(Boolean allowInstancePoolCreate) {
            return allowInstancePoolCreate(Output.of(allowInstancePoolCreate));
        }

        /**
         * @param applicationId This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param databricksSqlAccess This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
         * 
         * @return builder
         * 
         */
        public Builder databricksSqlAccess(@Nullable Output<Boolean> databricksSqlAccess) {
            $.databricksSqlAccess = databricksSqlAccess;
            return this;
        }

        /**
         * @param databricksSqlAccess This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
         * 
         * @return builder
         * 
         */
        public Builder databricksSqlAccess(Boolean databricksSqlAccess) {
            return databricksSqlAccess(Output.of(databricksSqlAccess));
        }

        /**
         * @param displayName This is an alias for the service principal and can be the full name of the service principal.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName This is an alias for the service principal and can be the full name of the service principal.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param externalId ID of the service principal in an external identity provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId ID of the service principal in an external identity provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param home Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
         * 
         * @return builder
         * 
         */
        public Builder home(@Nullable Output<String> home) {
            $.home = home;
            return this;
        }

        /**
         * @param home Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
         * 
         * @return builder
         * 
         */
        public Builder home(String home) {
            return home(Output.of(home));
        }

        /**
         * @param repos Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
         * 
         * @return builder
         * 
         */
        public Builder repos(@Nullable Output<String> repos) {
            $.repos = repos;
            return this;
        }

        /**
         * @param repos Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
         * 
         * @return builder
         * 
         */
        public Builder repos(String repos) {
            return repos(Output.of(repos));
        }

        /**
         * @param workspaceAccess This is a field to allow the group to have access to Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceAccess(@Nullable Output<Boolean> workspaceAccess) {
            $.workspaceAccess = workspaceAccess;
            return this;
        }

        /**
         * @param workspaceAccess This is a field to allow the group to have access to Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceAccess(Boolean workspaceAccess) {
            return workspaceAccess(Output.of(workspaceAccess));
        }

        public ServicePrincipalState build() {
            return $;
        }
    }

}
