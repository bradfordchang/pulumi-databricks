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
    /// ## Import
    /// 
    /// The resource Repo can be imported using the Repo ID (obtained via UI or using API) bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/repo:Repo this repo_id
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/repo:Repo")]
    public partial class Repo : global::Pulumi.CustomResource
    {
        /// <summary>
        /// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        /// </summary>
        [Output("branch")]
        public Output<string> Branch { get; private set; } = null!;

        /// <summary>
        /// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        /// </summary>
        [Output("commitHash")]
        public Output<string> CommitHash { get; private set; } = null!;

        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        /// </summary>
        [Output("gitProvider")]
        public Output<string> GitProvider { get; private set; } = null!;

        /// <summary>
        /// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/&lt;username&gt;/...`).  If the value changes, repo is re-created.
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        [Output("sparseCheckout")]
        public Output<Outputs.RepoSparseCheckout?> SparseCheckout { get; private set; } = null!;

        /// <summary>
        /// name of the tag for initial checkout.  Conflicts with `branch`.
        /// </summary>
        [Output("tag")]
        public Output<string?> Tag { get; private set; } = null!;

        /// <summary>
        /// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a Repo resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Repo(string name, RepoArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/repo:Repo", name, args ?? new RepoArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Repo(string name, Input<string> id, RepoState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/repo:Repo", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Repo resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Repo Get(string name, Input<string> id, RepoState? state = null, CustomResourceOptions? options = null)
        {
            return new Repo(name, id, state, options);
        }
    }

    public sealed class RepoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        /// </summary>
        [Input("commitHash")]
        public Input<string>? CommitHash { get; set; }

        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        /// </summary>
        [Input("gitProvider")]
        public Input<string>? GitProvider { get; set; }

        /// <summary>
        /// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/&lt;username&gt;/...`).  If the value changes, repo is re-created.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("sparseCheckout")]
        public Input<Inputs.RepoSparseCheckoutArgs>? SparseCheckout { get; set; }

        /// <summary>
        /// name of the tag for initial checkout.  Conflicts with `branch`.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public RepoArgs()
        {
        }
        public static new RepoArgs Empty => new RepoArgs();
    }

    public sealed class RepoState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        /// </summary>
        [Input("commitHash")]
        public Input<string>? CommitHash { get; set; }

        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        /// </summary>
        [Input("gitProvider")]
        public Input<string>? GitProvider { get; set; }

        /// <summary>
        /// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/&lt;username&gt;/...`).  If the value changes, repo is re-created.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("sparseCheckout")]
        public Input<Inputs.RepoSparseCheckoutGetArgs>? SparseCheckout { get; set; }

        /// <summary>
        /// name of the tag for initial checkout.  Conflicts with `branch`.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public RepoState()
        {
        }
        public static new RepoState Empty => new RepoState();
    }
}
