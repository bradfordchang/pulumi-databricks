# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetJobsResult',
    'AwaitableGetJobsResult',
    'get_jobs',
    'get_jobs_output',
]

@pulumi.output_type
class GetJobsResult:
    """
    A collection of values returned by getJobs.
    """
    def __init__(__self__, id=None, ids=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, dict):
            raise TypeError("Expected argument 'ids' to be a dict")
        pulumi.set(__self__, "ids", ids)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Mapping[str, Any]:
        """
        map of Job names to ids
        """
        return pulumi.get(self, "ids")


class AwaitableGetJobsResult(GetJobsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetJobsResult(
            id=self.id,
            ids=self.ids)


def get_jobs(ids: Optional[Mapping[str, Any]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJobsResult:
    """
    ## Example Usage

    Granting view Permissions to all Job within the workspace:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_jobs()
    everyone_can_view_all_jobs = []
    for range in [{"key": k, "value": v} for [k, v] in enumerate(this.ids)]:
        everyone_can_view_all_jobs.append(databricks.Permissions(f"everyoneCanViewAllJobs-{range['key']}",
            job_id=range["value"],
            access_controls=[databricks.PermissionsAccessControlArgs(
                group_name="users",
                permission_level="CAN_VIEW",
            )]))
    ```

    Getting ID of specific Job by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_jobs()
    pulumi.export("x", {
        "sensitive": False,
        "value": f"ID of `x` job is {this.ids['x']}",
    })
    ```
    ## Related Resources

    The following resources are used in the same context:

    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.


    :param Mapping[str, Any] ids: map of Job names to ids
    """
    __args__ = dict()
    __args__['ids'] = ids
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getJobs:getJobs', __args__, opts=opts, typ=GetJobsResult).value

    return AwaitableGetJobsResult(
        id=__ret__.id,
        ids=__ret__.ids)


@_utilities.lift_output_func(get_jobs)
def get_jobs_output(ids: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetJobsResult]:
    """
    ## Example Usage

    Granting view Permissions to all Job within the workspace:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_jobs()
    everyone_can_view_all_jobs = []
    for range in [{"key": k, "value": v} for [k, v] in enumerate(this.ids)]:
        everyone_can_view_all_jobs.append(databricks.Permissions(f"everyoneCanViewAllJobs-{range['key']}",
            job_id=range["value"],
            access_controls=[databricks.PermissionsAccessControlArgs(
                group_name="users",
                permission_level="CAN_VIEW",
            )]))
    ```

    Getting ID of specific Job by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_jobs()
    pulumi.export("x", {
        "sensitive": False,
        "value": f"ID of `x` job is {this.ids['x']}",
    })
    ```
    ## Related Resources

    The following resources are used in the same context:

    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.


    :param Mapping[str, Any] ids: map of Job names to ids
    """
    ...
