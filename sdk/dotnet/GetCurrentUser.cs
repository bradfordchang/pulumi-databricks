// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetCurrentUser
    {
        /// <summary>
        /// ## Exported attributes
        /// 
        /// Data source exposes the following attributes:
        /// 
        /// * `id` -  The id of the calling user.
        /// * `external_id` - ID of the user in an external identity provider.
        /// * `user_name` - Name of the user, e.g. `mr.foo@example.com`. If the currently logged-in identity is a service principal, returns the application ID, e.g. `11111111-2222-3333-4444-555666777888`
        /// * `home` - Home folder of the user, e.g. `/Users/mr.foo@example.com`.
        /// * `repos` - Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
        /// * `alphanumeric` - Alphanumeric representation of user local name. e.g. `mr_foo`.
        /// * `workspace_url` - URL of the current Databricks workspace.
        /// * `acl_principal_id` - identifier for use in databricks_access_control_rule_set, e.g. `users/mr.foo@example.com` if current user is user, or `servicePrincipals/00000000-0000-0000-0000-000000000000` if current user is service principal.
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
        /// * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        /// * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
        /// </summary>
        public static Task<GetCurrentUserResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCurrentUserResult>("databricks:index/getCurrentUser:getCurrentUser", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// ## Exported attributes
        /// 
        /// Data source exposes the following attributes:
        /// 
        /// * `id` -  The id of the calling user.
        /// * `external_id` - ID of the user in an external identity provider.
        /// * `user_name` - Name of the user, e.g. `mr.foo@example.com`. If the currently logged-in identity is a service principal, returns the application ID, e.g. `11111111-2222-3333-4444-555666777888`
        /// * `home` - Home folder of the user, e.g. `/Users/mr.foo@example.com`.
        /// * `repos` - Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
        /// * `alphanumeric` - Alphanumeric representation of user local name. e.g. `mr_foo`.
        /// * `workspace_url` - URL of the current Databricks workspace.
        /// * `acl_principal_id` - identifier for use in databricks_access_control_rule_set, e.g. `users/mr.foo@example.com` if current user is user, or `servicePrincipals/00000000-0000-0000-0000-000000000000` if current user is service principal.
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
        /// * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        /// * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
        /// </summary>
        public static Output<GetCurrentUserResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCurrentUserResult>("databricks:index/getCurrentUser:getCurrentUser", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetCurrentUserResult
    {
        public readonly string AclPrincipalId;
        public readonly string Alphanumeric;
        public readonly string ExternalId;
        public readonly string Home;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Repos;
        public readonly string UserName;
        public readonly string WorkspaceUrl;

        [OutputConstructor]
        private GetCurrentUserResult(
            string aclPrincipalId,

            string alphanumeric,

            string externalId,

            string home,

            string id,

            string repos,

            string userName,

            string workspaceUrl)
        {
            AclPrincipalId = aclPrincipalId;
            Alphanumeric = alphanumeric;
            ExternalId = externalId;
            Home = home;
            Id = id;
            Repos = repos;
            UserName = userName;
            WorkspaceUrl = workspaceUrl;
        }
    }
}
