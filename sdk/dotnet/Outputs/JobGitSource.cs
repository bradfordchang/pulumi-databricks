// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class JobGitSource
    {
        /// <summary>
        /// name of the Git branch to use. Conflicts with `tag` and `commit`.
        /// </summary>
        public readonly string? Branch;
        /// <summary>
        /// hash of Git commit to use. Conflicts with `branch` and `tag`.
        /// </summary>
        public readonly string? Commit;
        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
        /// </summary>
        public readonly string? Provider;
        /// <summary>
        /// name of the Git branch to use. Conflicts with `branch` and `commit`.
        /// </summary>
        public readonly string? Tag;
        /// <summary>
        /// URL of the Git repository to use.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private JobGitSource(
            string? branch,

            string? commit,

            string? provider,

            string? tag,

            string url)
        {
            Branch = branch;
            Commit = commit;
            Provider = provider;
            Tag = tag;
            Url = url;
        }
    }
}
