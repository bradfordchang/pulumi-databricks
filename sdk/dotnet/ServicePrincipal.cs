// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// Creating regular service principal:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sp = new Databricks.ServicePrincipal("sp", new()
    ///     {
    ///         ApplicationId = "00000000-0000-0000-0000-000000000000",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating service principal with administrative permissions - referencing special `admins` databricks.Group in databricks.GroupMember resource:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var admins = Databricks.GetGroup.Invoke(new()
    ///     {
    ///         DisplayName = "admins",
    ///     });
    /// 
    ///     var sp = new Databricks.ServicePrincipal("sp", new()
    ///     {
    ///         ApplicationId = "00000000-0000-0000-0000-000000000000",
    ///     });
    /// 
    ///     var i_am_admin = new Databricks.GroupMember("i-am-admin", new()
    ///     {
    ///         GroupId = admins.Apply(getGroupResult =&gt; getGroupResult.Id),
    ///         MemberId = sp.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating service principal with cluster create permissions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sp = new Databricks.ServicePrincipal("sp", new()
    ///     {
    ///         AllowClusterCreate = true,
    ///         ApplicationId = "00000000-0000-0000-0000-000000000000",
    ///         DisplayName = "Example service principal",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating service principal in AWS Databricks account:
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // initialize provider at account-level
    ///     var mws = new Databricks.Provider("mws", new()
    ///     {
    ///         Host = "https://accounts.cloud.databricks.com",
    ///         AccountId = "00000000-0000-0000-0000-000000000000",
    ///         Username = @var.Databricks_account_username,
    ///         Password = @var.Databricks_account_password,
    ///     });
    /// 
    ///     var sp = new Databricks.ServicePrincipal("sp", new()
    ///     {
    ///         DisplayName = "Automation-only SP",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = databricks.Mws,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating group in Azure Databricks account:
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // initialize provider at Azure account-level
    ///     var azureAccount = new Databricks.Provider("azureAccount", new()
    ///     {
    ///         Host = "https://accounts.azuredatabricks.net",
    ///         AccountId = "00000000-0000-0000-0000-000000000000",
    ///         AuthType = "azure-cli",
    ///     });
    /// 
    ///     var sp = new Databricks.ServicePrincipal("sp", new()
    ///     {
    ///         ApplicationId = "00000000-0000-0000-0000-000000000000",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = databricks.Azure_account,
    ///     });
    /// 
    /// });
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
    /// * databricks.GroupMember to attach users and groups as group members.
    /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.
    /// 
    /// ## Import
    /// 
    /// The resource scim service principal can be imported using idbash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/servicePrincipal:ServicePrincipal me &lt;service-principal-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/servicePrincipal:ServicePrincipal")]
    public partial class ServicePrincipal : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        /// </summary>
        [Output("allowClusterCreate")]
        public Output<bool?> AllowClusterCreate { get; private set; } = null!;

        /// <summary>
        /// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Output("allowInstancePoolCreate")]
        public Output<bool?> AllowInstancePoolCreate { get; private set; } = null!;

        /// <summary>
        /// This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        /// </summary>
        [Output("databricksSqlAccess")]
        public Output<bool?> DatabricksSqlAccess { get; private set; } = null!;

        /// <summary>
        /// This is an alias for the service principal and can be the full name of the service principal.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        [Output("externalId")]
        public Output<string?> ExternalId { get; private set; } = null!;

        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have access to Databricks Workspace.
        /// </summary>
        [Output("workspaceAccess")]
        public Output<bool?> WorkspaceAccess { get; private set; } = null!;


        /// <summary>
        /// Create a ServicePrincipal resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServicePrincipal(string name, ServicePrincipalArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/servicePrincipal:ServicePrincipal", name, args ?? new ServicePrincipalArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServicePrincipal(string name, Input<string> id, ServicePrincipalState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/servicePrincipal:ServicePrincipal", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServicePrincipal resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServicePrincipal Get(string name, Input<string> id, ServicePrincipalState? state = null, CustomResourceOptions? options = null)
        {
            return new ServicePrincipal(name, id, state, options);
        }
    }

    public sealed class ServicePrincipalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// This is an alias for the service principal and can be the full name of the service principal.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to Databricks Workspace.
        /// </summary>
        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        public ServicePrincipalArgs()
        {
        }
        public static new ServicePrincipalArgs Empty => new ServicePrincipalArgs();
    }

    public sealed class ServicePrincipalState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// This is an alias for the service principal and can be the full name of the service principal.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to Databricks Workspace.
        /// </summary>
        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        public ServicePrincipalState()
        {
        }
        public static new ServicePrincipalState Empty => new ServicePrincipalState();
    }
}
