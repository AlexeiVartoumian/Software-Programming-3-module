-Hello world on main - Commit 15


Git excercise closing notes:
Fun excercise! 
made a mistake by not merging on commit 8 branch1 onto the main branch
but tried to make up for it by grabbing the specific hash of that commit
using git log on branch1 and then git cherry-pick on main branch with that hash.
this was mainon commit 13.
on commit 15 I have a tree structure that nearly resembles the excercise tree
but minus the connection on commit8.

commands I learnt on the way:
git log --graph : all the commits done on the repo HEAD means what branch your on

git ls-remote --heads origin : shows all the branches a repo has online

git checkout -b "your branch" : how to locally create a branch

git push -u origin "your branch" : hot to push a branch to remote repo

git checkout "yourbranch" : switch to working in this branch
git merge "your branch" -m"some messge" : whatever Head is pointing to will be where the results of the merge be applied

if conflict then either choose one or the other branch by amending the produced files by git or rewrite entirely.
then add/commit normally.

git log : shows all the commits specific to a branch and the hash identifier for each commit

git cherry-pick <some-hash> : like git merge but for specific commit


