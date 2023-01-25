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
    public sealed class JobTaskDbtTask
    {
        /// <summary>
        /// The name of the catalog to use inside Unity Catalog.
        /// </summary>
        public readonly string? Catalog;
        /// <summary>
        /// (Array) Series of dbt commands to execute in sequence. Every command must start with "dbt".
        /// </summary>
        public readonly ImmutableArray<string> Commands;
        /// <summary>
        /// The relative path to the directory in the repository specified by `git_source` where dbt should look in for the `profiles.yml` file. If not specified, defaults to the repository's root directory. Equivalent to passing `--profile-dir` to a dbt command.
        /// </summary>
        public readonly string? ProfilesDirectory;
        /// <summary>
        /// The relative path to the directory in the repository specified in `git_source` where dbt should look in for the `dbt_project.yml` file. If not specified, defaults to the repository's root directory. Equivalent to passing `--project-dir` to a dbt command.
        /// </summary>
        public readonly string? ProjectDirectory;
        /// <summary>
        /// The name of the schema dbt should run in. Defaults to `default`.
        /// </summary>
        public readonly string? Schema;
        /// <summary>
        /// The ID of the SQL warehouse that dbt should execute against.
        /// </summary>
        public readonly string? WarehouseId;

        [OutputConstructor]
        private JobTaskDbtTask(
            string? catalog,

            ImmutableArray<string> commands,

            string? profilesDirectory,

            string? projectDirectory,

            string? schema,

            string? warehouseId)
        {
            Catalog = catalog;
            Commands = commands;
            ProfilesDirectory = profilesDirectory;
            ProjectDirectory = projectDirectory;
            Schema = schema;
            WarehouseId = warehouseId;
        }
    }
}
