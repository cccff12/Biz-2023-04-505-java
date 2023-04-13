# Java 개발자 도구 
1. jdk 17 설치 : java.com
2. 7zip 설치 : 7zip.org
3. D2coding font 설치
4. eclipse 설치 : eclipse.org

## git repository 생성
1. 새로운 컴퓨터에서 최초로 github 를 사용하고자 할때 설정

```bash
git config --global user.name cccff12
git config --global user.email ksun0430@naver.com
```

2. 새로운 원격 repository를 생성하고, local Repository 생성하기 : `git init`


```bash
git init
```
3. Repository에 대한 설명을 하기 위하여 README.md 파일생성하기

4. 원격 repository 별명 설정하기 : 
`git remote add origin https://github.com/cccff12/Biz-2023-04-java.git`

### 기존의 repository에 계속해서 update 하고자 할때
 
5. 현재 폴더의 파일과 폴더를 local Repository 에 압축하고, 암호화하여 보관하기 : `git add .`
6. 현재 local Repository 에 보관된 압축된 데이터에 대한 Comment 를 추가하기 : `git commit-m first`
7. local Repository 로 pusy : `git push -u origin
master`

```bash
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/cccff12/Biz-2023-04-Javagit
git push -u origin master
```